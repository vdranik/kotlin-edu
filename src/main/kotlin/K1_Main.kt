package kotl

/*

Java и Kotlin полностью совместимы. Их можно использовть одновременно в одном проекте.

В названиях пакетов нельзя использовыать слова kotlin и java т.к. они зарезервированы.

В Java весь код пишут внутри класса.
В Kotlin это не обязательно. Можно писать методы прямо внутри файла, они будут доступны в любом месте программы, если не будут помечены как один проект.

В Java нужно обязательно указывать модификатор доступа.
В Kotlin если мы не указываем модификатор доступа, то он public по умолчанию.

В Kotlin нет static. Есть что-то вроде глобальных методов и обьектов.
Тип возщвращаемого значения у main в java - void. В Kotlin, если метод ничего не возвращает, то мы ничего не пишем.
Не нужно явно указывать void.

Чтобы показать что это метод, пишем слово fun и затем ее имя main.

В Java сначала пишем тип переменной, а потом ее имя. В Kotlin наоборот, сначала имя переменной: Тип.

В Kotlin массивы - это тоже классы.
args: Array<String>

println - обертка над System.out.println, не нужно писать по старому (хотя и можно)

В Kotlin не нужна ;

 */

fun main() {
    println("Hello world")

        println(isValidIdentifier("name"))   // true
        println(isValidIdentifier("_name"))  // true
        println(isValidIdentifier("_12"))    // true
        println(isValidIdentifier(""))       // false
        println(isValidIdentifier("012"))    // false
        println(isValidIdentifier("no$"))    // false


        val message = "Message attachment size exceeded maximum allowed size of 31457280 bytes"

    println("!!!!!"+ message.contains("Message attachment size exceeded maximum"))
}


fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s){
        if (!(ch == '_' || ch.isLetterOrDigit())) return false
    }
    return true
}

//if(s.isEmpty()) return false
//if(s[0].isDigit()) return false
//if(s.contains('$')) return false
//return true