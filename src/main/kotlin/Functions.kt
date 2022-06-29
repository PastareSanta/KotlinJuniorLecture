fun tryFunctions() {
    defaultParams("Toms", "Chinese")
    defaultParams()
    defaultParams(level = "C1")

    println(varargs("Ivo", "Zanda", "Karlis"))
    vararg("Ivo", "Zanda", "Karlis")
}

fun defaultParams(name: String = "Janis", language: String = "Latvian", level: String = "C2") {
    println("$name speaks $language in a $level level")
}

fun varargs(vararg name: String) = name.map { it }
fun vararg(vararg name: String) {
    for (n in name) {
        println(n)
    }
}
