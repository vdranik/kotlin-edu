package kotl

// В циклах while\do-while не произошло никаких изменений
fun main() {

    var simpleArray = arrayOf(1, 3, 5, 3, 6, 5);
    // необязательно вводить тип переменной
    for (i in simpleArray) {
        println(i)
    }
    println("1======")


    val arrayOfNulls = arrayOfNulls<Int?>(5)
    for (i in arrayOfNulls) {
        println(i)
    }
    println("2======")


    for (i in 0..10) { // диапазонт от 0 до 100
        println(i)
    }
    println("3======")

/*
    for (i in 0..simpleArray.size){ // будет ошибка выхода за границы масива
        arrayOfNulls[i] = i
        println(simpleArray[i])
    }
    println("4======")
*/

    // решение проблемы #1
    for (i in 0 until simpleArray.size) {
        simpleArray[i] = i
        println(simpleArray[i])
    }
    println("4======")

    // решение проблемы #2
    for (i in simpleArray.indices) {
        simpleArray[i] = i
        println(simpleArray[i])
    }
    println("5======")


    // если хотим идти от большего к меньшему, используем downTo
    for (i in 10 downTo 0) {
        println(i)
    }
    println("6======")


    // от большего к меньшему с шагом 2 (берется каждый 2й элемент)
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
    println("7======")


    val myArray = arrayOfNulls<Int?>(100)
    for ((index, i) in (200 until 300).withIndex()) { // доступ не только к самой переменной, но и к ее индексу
        myArray[index] = i
        println(i)
    }
    println("8======")


    for ((index, i) in myArray.withIndex()) {
        myArray[index] = /*  i * 2 */
            i?.times(2) // times - безопасное умножение, если равна null, то ничего не произойдет, если не равна - умножения на 2
        println(myArray[index])
    }
    println("9======")


    val array1 = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) { // with index также есть у диапазонов
        array1[index] = i
        println(array1[index])
    }
    println("10======")


    for (i in array1.size - 1 downTo 0 step 5) {
        println(i)
    }
    println("11======")


    val coApprovals = arrayOf(1, 3, 5);
    coApprovals.forEach {
       println(testMethod(it))
    }

}

fun testMethod(int: Int): Int?{
    if(int==3){
        return null
    }
    return int
}
