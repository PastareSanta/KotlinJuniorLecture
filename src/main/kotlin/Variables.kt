fun showAvailableDataTypes() {
    println("Integer data types.")
    println("Byte: smallest value: ${Byte.MIN_VALUE}, larges value ${Byte.MAX_VALUE}")
    println("Short: smallest value: ${Short.MIN_VALUE}, larges value ${Short.MAX_VALUE}")
    println("Int: smallest value: ${Int.MIN_VALUE}, larges value ${Int.MAX_VALUE}")
    println("Long: smallest value: ${Long.MIN_VALUE}, larges value ${Long.MAX_VALUE}")
    println("Floating data type.")
    println("Float: smallest value: ${Float.MIN_VALUE}, larges value ${Float.MAX_VALUE}")
    println("Double: smallest value: ${Double.MIN_VALUE}, larges value ${Double.MAX_VALUE}")
    println("Boolean data type")
    println("Boolean: available values ${true} and ${false}")
    println("Character data type")
    println("Char: smallest value: ${Char.MIN_VALUE}, larges value ${Char.MAX_VALUE}")
}

fun tryDataTypes() {
    val myByte: Byte = 100
    val myShort: Short = 5000
    val myInt = 777
    var myLong = 1500000000000
    val myFloat = 9.99F
    val myDouble: Double = 1.1
    val myBoolean = true
    val myChar = 'A'
    val myString = "Bla bla bla"

    val initializedLater: Int
    initializedLater = 111
    println(initializedLater)

//    val myCharacter: Char = 77
    myLong = myInt.toLong()
    val longerVar = 123456789123
    val intVar: Int = longerVar.toInt()
    println(intVar)

    var nullString: String? = null
}