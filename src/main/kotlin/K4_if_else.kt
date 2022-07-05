package kotl


// В отличие от Java в kotlin if явл. ВЫРАЖЕНИЕМ и может возвращать значение
fun main() {

    var count = 50
    //  Any (kotlin) == Object (java)
    val value: Any? =  // здесь мы напрямую используем присваивание переменной в комбинации с if
        if (count > 40) {
            count += 11
            // последняя строка выражения - это то что мы возвращаем
            ">40" // можем вставить свое возвращаемое значение
        } else if (count > 60) {
            count += 100
            500   // возвращаемое значение, если возвр. значения разные, то принимающий тип сводится к Any (как Object в Java)
        } else {  // так как в Kotlin if это выражение (а не условие как в Java), то должен всегда быть страхующий else
            null
        }
    println("value $value, valueToString ${value.toString()}") // знак $ можно использовать в конкотенации


    // Unit (kotlin) == Void (java)
    val value2 = if (count > 40) {  // вернет тип Unit, аналог Void в Java, так как ничего не возвращаем
        // Unit
    } else if (count > 60) {
        // Unit
    } else {
        // Unit
    }
    println(value2) // kotlin.Unit
}