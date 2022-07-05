package kotl


fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee #$it" }
    val first30 = employees.take(30) // берем только первые 30 элем.
    val last30 = employees.takeLast(30) // берем только последние 30 элем.
    val dropFirst30 = employees.drop(30) // сбрасываем первые 30 элем.
    val dropLast30 = employees.dropLast(30) // сбрасиваем последние 30 элем.
    println(first30)


    // Бесконечные последовотелности
    //val generatedSequence = generateSequence(0, {it + 2})  //если  0 - начало последовательности, и функция генератор, сначала 0, потом 0+2 и т.д.
    //val generatedSequence = generateSequence(0) {it + 2}  //если лямбда выражение явл. последним арг., то круглые скобки можно не ставить
    val generatedSequence = generateSequence(0) { // ленивая инициализация, значение генерируется только перед каждым обращением к элементу
        println("Created: ${it + 2}")
        it + 2
    } // если лямбда-выражение явл. последним параметром, круглые скобки можно не ставить
    val evenList = generatedSequence.take(10)
    for (i in evenList) println(i)


    // Выводим табл. символов
    val generatedCharSequence = generateSequence('A') {
        it + 1
    }
    for (i in generatedCharSequence.take(10)) {
        println(i)
    }

    // Без первого параметра, генерация бесконечной послед. случ. чисел от 0 до 100
    val arrayRandom = generateSequence {
        (Math.random() * 100).toInt()
    }
    for (i in arrayRandom.take(10)) {
        println(i)
    }


    val arr = generateSequence("Employee #1") {
        val index = it.substring(10).toInt()
        "Employee #${index + 1}"
    }

    val listOfFisrt10 = arr.take(10)
    for (i in listOfFisrt10) {
        println(i)
    }
}


