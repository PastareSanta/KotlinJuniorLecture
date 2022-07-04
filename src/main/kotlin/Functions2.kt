import kotlinx.coroutines.*

fun functions2() {
    val john = Human("John", 19)
    val sarah = Human("Sarah", 49)
    val joseph = Human("Joseph", 93)

    val humans = mutableListOf(sarah, joseph, john)
    println(humans)
    humans.forEach { println("${it.name} is ${it.age} years old") }

    val filtered = humans.filter { it.age > 30 }.filter { it.name == "Sarah" }
    val ifAny = humans.none { it.name == "Paula" }
    println(ifAny)

    sarah.apply {
        println(name)
        age++
        println("$name is now $age years old")
    }

    val nString: String? = if(true) null else null
    println(nString?.length)
    val n = nString ?: "This string is null"
    println(n)
    nString?.let {
        println("This variable is not null")
    }

    var nullVar: String? = null
    nullVar = "CDE"

    val greeting = { name: String, age: Int -> "Hi! My name is $name and I'm $age years old." }
    val greeting2 = { "Hi! My name old." }
    val greeting3: (String, Int) -> Double = { name, age -> 15.3 }
    println(greeting("Oto", 13))
    println(greeting2.invoke())

    val lambda = { println("JJ") }

    var integer = 4
    println(integer.plus())
}

fun Int.plus(): Int = this.plus(5)

fun tryCoroutines() {
    GlobalScope.launch {
        task2()
    }

    task1()

    Thread.sleep(1000L)
}

fun task1() {
    print("Hello")
}

suspend fun task2() {
    withContext(Dispatchers.IO) {
        delay(500)
        print("World")
    }
}