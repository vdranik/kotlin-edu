package kotl

fun main() {
    // Массивы - коллекция данных фиксированной длины
    // В Kotlin массив явл. Классом
    val array = arrayOf(1, 2, 3, 4, 5)   // setOf<>(), mapOf<>(), listOf<>()
    array[4] = 10
    // array[4] = null - мы не можем так сделать, т.к. тип ненуллабельный

    val arrayWithNull = arrayOf(1, 2, 3, 4, 5, null) // тип автоматически стал нуллабельным
    arrayWithNull[4] = null  //  и теперь можем присвоить null

    val arrayWithNull2: Array<Int?> = arrayOf(1, 2, 3, 4, 5) // явно помечаем тип как нуллабельный
    arrayWithNull2[4] = null

    val arrayWithNull3 =
        arrayOfNulls<Int?>(10) // нулабельный массив с размером 10 (заполненный null-ами), где обязательно указываем нуллабельный тип

    // При создании не используем new
    // Всегда используйте абстракции вместо реализаций, тут важно указать тип List<Int> явно!, иначе по умолчанию будет присвоен  ArrayList<Int>
    val listOfNumbers: List<Int> = ArrayList<Int>() // По умолчанию все БАЗОВЫЕ коллекции (List<>, Set<>, Map<>) явл. неизменяемыми!
    //listOfNumbers.add(5) //так как коллекция базовая, она НЕИЗМЕНЯЕМАЯ, а значит мы не можем вызвать add

    val mutableListOfNumbers: MutableList<Int> =
        ArrayList<Int>() // нужна изменяемая коллекция - используйте интерфейсы с приставкой Mutable
    mutableListOfNumbers.add(5)
    println(mutableListOfNumbers[0]) // к элементам листа можно обращаться также как к элементам массива, вместо mutableListOfNumbers.get(0)

    val mutableListOfNumbers2: MutableList<Int> = mutableListOf<Int>() // mutableSetOf<>(), mutableMapOf<>(), mutableListOf<>()
    // mutableListOf<>() вернет ArrayList

}