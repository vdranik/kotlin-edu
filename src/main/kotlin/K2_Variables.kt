package kotl

fun main() {

    // В Kotlin  сначала указывается имя переменной, а потом ее тип
    // String тут серого цвета, т.к. компилятор при присваивании определяет тип переменной
    var someChangeableValue: String = "Hello world"
    someChangeableValue = "Hi"
    println(someChangeableValue)

    // Если переменная инициализируется сразу после создания, то ее тип можно не указывать
    // Везде, где только возможно, используйте val
    val myName = "Vova" // val в Kotlin == final в Java, присвоить можно только один раз
    println(myName)

    // В Kotlin нет примитивных типов. АБСОЛЮТНО! все типы явл. ссылочными
    val age: Long = 35L
}