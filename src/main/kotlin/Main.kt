import java.lang.NumberFormatException
import java.time.LocalDateTime

fun main() {
    println("Hello World!")

//    tryFunctions()
//    functions2()
//    tryCoroutines()

    showMenu()
}

fun showMenu() {
    Menu.values().forEach { value ->
        println("${value.index} ${value.text}")
    }

    when(getIntegerInput(MESSAGE)) {
        Menu.ALL_DATA_TYPES.index -> showAvailableDataTypes()
        Menu.TRY_ALL_DATA_TYPES.index -> tryDataTypes()
        Menu.CONTROL_FLOWS.index -> tryControlFlows(LocalDateTime.now())
    }

    showMenu()
}

fun getIntegerInput(message: String): Int {
    var input = -1
    while (input < 0) {
        try {
            input = getStringInput(message).toInt()
        } catch (exception: NumberFormatException) {
            println(ERROR)
        }
    }
    return input
}

fun getStringInput(message: String): String {
    print(message)
    var input = readLine()!!.trim()
    while (input.isBlank()) {
        input = getStringInput(message)
    }
    return input
}

