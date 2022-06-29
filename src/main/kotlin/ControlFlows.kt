import java.time.LocalDateTime

fun tryControlFlows(currentTime: LocalDateTime): Unit {
    var done = false

    println("If statements")

    if (currentTime.hour == 18 && currentTime.minute > 45) println("Break time!")
    else if (currentTime.hour == 19 && currentTime.minute >45) done = true

    val answer = if (done) "Wuhhuuu" else "Oh, no, not yet!"

    println("Are we done yet? $answer")

    println("When expression")
    val age = (0..100).random()
    when(age) {
        18 -> println("The person is 18 years old")
        0, 3 -> println("The person is 0 or 3 years old")
        in 0 until 13  -> println("The person is a kid")
        else -> {
            println("The person is $age years old")
        }
    }

    println("While loop")
    var code = 30
    val reset = "\u001b[0m"

    while (code <= 37) {
        val color = "\u001b[" + code +"m"
        println(color + "Hello there")
        code++
    }
    println(reset + "Hello there")

    println("Do while loop")
    do {
        val y = (0..11).random()
        println(y)
    } while (y != 10)

    println("For loop")
    for (i in 'A'..'Z') print(i)
    println()
    for (i in 6 downTo 0 step 2) println(i)

    val array = arrayOf("Monday", "Tuesday", "Wednesday")
//    for (i in array) println(i)
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    println("For each loop")

    val kotlinChars = arrayListOf('K', 'o', 't', 'l', 'i', 'n')
    kotlinChars.forEach { print(it) }
    kotlinChars.forEach { c ->
        print(c)
    }

    println()
    for (letter in answer) {
        if (letter == ',') break
        println(letter)
    }
}