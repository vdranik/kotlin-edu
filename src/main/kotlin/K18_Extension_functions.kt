package kotl

// Мы можем расширить любой класс новыми методами
fun main() {
    // в данном примере мы работаем с переменной age класса Int и можем расширить этот класс функцией isAgeValid
    val age = 5


/*  if(age in 12..100) {
        println("Valid")
    }

    // эта проверка может быть указана много раз в разных местах, и если нужно будет менять этот метод, то изменять придется в 3х местах
    if(age in 12..100) {
        println("Valid too")
    }

    if(age in 12..100) {
        println("Valid too again")
    }*/


    // для того чтобы попробовать исправить это, мы создадим метод isAgeValid
//    if(isAgeValid(age)){
//        println("Valid")
//    }

    // однако есть другое решение - extension functions
    // мы можем расширить любой класс новыми методами
    // в данном случае мы работаем над переменной типа Int, и в Int мы можем добавить новый метод isAgeValid
    if (age.isAgeValid()) { // у age типа Int напрямую вызываем функцию
        println("Valid")
    }

    // другой пример
    println("Age is positive ${age.isPositive()}")

    println(5.isPrime())


    // давайте попробует сделать такой свой метод
/*  val list = listOf<Int>()
    with(list){
        sum()
        average()
    }*/

    // решение
    val list = listOf<Int>()
    myWith(list) {
        sum()
        average()
    }

    val string = "some string"
    myWith(string) {
        println(this.toUpperCase())
    }


}

//fun isAgeValid(age: Int) = age in 12..100

// добавляем новый метод в Int. Числом тут выступает this.  Проверяем, что вот это число входит в диапазон
fun Int.isAgeValid() = this in 12..100

fun Int.isPositive() = this >= 0

// в данном случае this можно не указывать, т.к. напрямую обращаемся к методам из класса Int
fun Int.someMethod() = isAgeValid()


// метод проверка на простое число
fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

// Давайте попробуем создать функцию with с помощью extension functions
//fun myWith(list: List<Int>, operation: () -> Unit ) { // в этом случает функ. operation не расширяет класс List
//
//}

fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) { // тут расширяем, передаем функцию, которая расширяет класс List
    list.operation()
}

// и теперь вместо with
fun main2() {
     val list = listOf<Int>()
     with(list){
        sum()
        average()
    }
}

// мы можем использовать myWith
fun main3() {
    val list = listOf<Int>()
    myWith(list){    // 1й параметр
        sum()        // 2й параметр - функция в {}    Так как эта функция расширяет класс лист, то мы можем обращаться к объекту листа через this вызывая у него различные методы
        average()
    }
}

fun myWith(string: String, operation: String.() -> Unit) { // перегружаем метод с типом String
    string.operation()
}

// а что, если хотим, чтобы функ. with работала со всеми типами? Сделать миллион перегрузок не вариант

//fun myWith(obj: Any, operation: Any.() -> Unit) { // этот подход не работает потому что у Any не будет необходимых нам методов, только методы Any
//    obj.operation()
//}

// a что, если тип нашего объекта будет тоже переменной?
// указываем данную функцию как параметризированную fun<T>
// + т.к. наша функция принимает другую функцию, помечаем ее inline
inline fun <T> myWith(obj: T, operation: T.() -> Unit) {  // это назыв. параметризированный тип, Generic
    obj.operation()
}


// теперь мы можем удалить 2 верхних myWith
// и можем работать с абсолютно любым объектом
fun main4() {
    val obj = mapOf<String, String>()
    myWith(obj){
        keys
        values
    }
}


// а что, если нам нужно возвращать значение?
inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {  // это назыв. параметризированный тип, Generic
    return obj.operation()
}