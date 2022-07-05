package kotl

fun main() {
    println(max2(5, 10))
    println(firstFiveLetters("somestring"))
    println(sum(1, 2, 3, 4, 5, 6))

    val result1 = bubbleSort(4, 7, 2, 9, -1, 4, 8)
    val result2 = bubbleSort(arrayOf(4, 7, 2, 9, -1, 4, 8))
    println(result1)
    println(result2)
}

// для обьявлении функции используется слово fun
fun max(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}

// более короткий вариант
fun max2(a: Int, b: Int): Int = if (a > b) a else b // вместо return используем =

fun firstFiveLetters(str: String): String = str.substring(
    0,
    Math.min(5, str.length)
) // Math перестраховывет нас в случае, если строка будет иметь меньше 5 символов


// аргументы переменной длины, аналог в java (int... numbers)
fun sum(vararg numbers: Int): Int {
    var result = 0;
    for (num in numbers) {
        result += num
    }
    return result
}

fun bubbleSort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

//  любые массивы,коллекции, ли аргументы переменной длинны можно привести к MutableList, List
fun bubbleSort(numbers: Array<Int>) = bubbleSort(numbers.toMutableList())
fun bubbleSort(vararg numbers: Int) = bubbleSort(numbers.toMutableList())
