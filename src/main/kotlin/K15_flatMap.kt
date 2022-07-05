package kotl

fun main() {
    // массив в котором лежат другие массивы (выручки за недели)
    val revenueByWeek = listOf(
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32),
        listOf(5, 3, 7, 45, 7, 32)
    )

    // задача: получить среднюю выручку за 7 дней
    // как вариант создать новую коллекцию и добавить туда все элементы
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for(i in it){
//            total.add(i)
//        }
//    }
//    val average = total.average()  // average можно вызвать только у обычного листа "примитивного" типа
//    println(average)
// однако здесь мы получили изменяемую коллекцию + много кода

    // вариант по-лучше, flatMaр сделает то же самое
    val total = revenueByWeek.flatten() // flatten() = revenueByWeek.flatMap { it }
    val average = total.average()       // теперь у нас есть не массив массивов, а сразу массив чисел из которого можно взять среднее
    println(average)


    // Заполнение map, 3 варианта
    // 1
//    val fileData = mutableMapOf<String, List<Int>>()
// // data.put("file1", listOf(1,2,3,4,5)) - лучше так не писать
//    data["file1"] = listOf(1,2,3,4,5)  // котлин формат вставки, так лучше
//    data["file2"] = listOf(1,2,3,4,5)
//    data["file3"] = listOf(1,2,3,4,5)
// // однако такй подход не очень хороший, т.к. использует мутабленую переменную

    // 2 - вариант с немутабельной переменной
//    val fileData = mapOf<String, List<Int>> (
//        "file1" to listOf(1,2,3,4,5),
//        "file2" to listOf(1,2,3,4,5),
//        "file3" to listOf(1,2,3,4,5)
//    )

    // 3 - еще вариант с немутабельной переменной
    val fileData = mapOf(
        Pair("file1", listOf(15, 20, 45, 15, 12)),
        Pair("file2", listOf(300, -20, 45, 15, 12)), // т.к. в этой коллекции есть значение -20, она будет проигнорирована
        Pair("file3", listOf(15, 40, 45, 15, 72))
    )

    //  находим среднее
    //  val avgr = fileData.flatMap { it.value }.average()

    // находим среднее в коллекциях, которые не имеют отрицательных значений
    // it.value.all - берем значение (список) и с помощью all проверяем все элементы на >= 0, file2 теперь не учитывается
    val avrg = fileData.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(avrg)


    // задача
    // есть выручка за месяц с данными по каждой неделе
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200), // здесь есть поврежденные данные, т.к. выручка не может быть отрицательной
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300), // здесь есть поврежденные данные, т.к. выручка не может быть отрицательной
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } } // если хотя бы одно значение < 0, то filterNot проигнорирует это значение (месяц)
    println("validData $validData")
    // средняя выручка в неделю
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val averageMonth = listOfSum.average()

    val maxMonths = validData.filter { it.value.sum() == max }.keys
    val minMonths = validData.filter { it.value.sum() == min }.keys
    println("Средняя выручка в месяц: $averageMonth")
    println("Максимальная выручка в месяц: $max")
    print("Была в следующих месяцах: ")
    for (month in maxMonths) {
        print("$month ")
    }
    println("\nМинимальная выручка в месяц: $min")
    print("Была в следующих месяцах: ")
    for (month in minMonths) {
        print("$month ")
    }

    val invalidData = data.filter { it.value.any { it < 0 } }
    val errorMonths = invalidData.keys
    print("\nОшибки произошли в след. месяцах: ")
    for (month in errorMonths) {
        print("$month ")
    }
}