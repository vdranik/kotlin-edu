package kotl

fun main() {
    val listOfNumbers: MutableList<Int> = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

//    val listOfEvenNumbers = listOfNumbers.filter ({ number: Int -> number % 2 == 0 })
    val listOfEvenNumbers =
        // filter в качетсве параметра принимает predicate и возвр. boolean
        listOfNumbers.filter { it % 2 == 0 } // если функция в качестве параметра принимает лямбда-выражение, и данный параметр явл. последним, то круглые скобки можно не ставить
    println(listOfEvenNumbers)

    val names = listOf("Ivan", "Andy", "Tamara", "Irina")
    val namesStartsFromA = names.filter { it.startsWith("A") }
    println(namesStartsFromA)

    val numbers = (0..100).toList() //  как вариант сделать оист чисел
    // map - может преобразовать коллекцию в любую другую
    val doubledNumbers = numbers.map { it * 2 } // будет вызывать функцию для каждого элемента
    println(doubledNumbers)

    val employees = numbers.map { "Employees $it" }
    println(employees)

    val array = arrayOf(8, 12, 5, 4, 75, 45)
    val sortedArray = array.sorted() // .sortedDescending()
    println(sortedArray)

    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    println(result)


}