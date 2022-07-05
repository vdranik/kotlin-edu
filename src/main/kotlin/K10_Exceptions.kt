package kotl

import java.lang.Exception

// Kotlin  не имеет checked exceptions!!!
fun main() {
    sum("5", "asdfg")


    println(436765834543L.toInt().toString().padStart(8, '0'))
}

fun sum(a: String, b: String): Int {
    val result = try {  // try-catch явл. выражением и может возращать значение, в остальном все так же как в Java
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB         // возвращаемое значение
    } catch (ex: Exception) {
        0                   // возвращаемое значение
    }

    println(result)
    return result
}