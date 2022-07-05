package kotl.oop.k28_companion_object

// В Kotlin нет ключ. слова static
fun main() {

    val calc = Calc()
    println(Calc.square(3))

    println(MyRandom.randomInt(5, 10))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())
}