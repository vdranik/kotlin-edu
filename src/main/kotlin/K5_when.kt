package kotl

// when явл. аналогом switch-case в Java
fun main() {

    val nameOfMonth = "March"
    // when (как и if) явл. выражением, его результат можно сразу присвоить переменной
    var season =
        when (nameOfMonth) {
            "December", "January", "February" -> "WINTER" // case и break ненужны
            "March", "April", "May" -> "SPRING"
            else -> "No season"
        }
    println(season)


    val indexOfMonth = 3
    season = when (indexOfMonth) {
        12, 1, 2 -> { // если результат состоит из 1й строки, фигурные скобки не обязательны
            "WINTER"
        }
        // можно указывать не только значения, но и диапазон
        in 3..5 -> { // в диапазоне от 3 до 5 (3 и 5 входят в диапазон)
            "SPRING"
        }
        else -> "No season"
    }
    println(season)


    val temp = 80
    val state = when { // не передаем ничего в аргументы
        temp < 0 -> "Ice"
        temp in 0..100 -> "Liquid"
        else -> "Steam"
    }
    println(state)


    val time = 12
    val weatherIsGood = true
    val res = when {
        time in 6..22 && weatherIsGood -> "Go walking!"
        time in 6..22 && !weatherIsGood -> "Let's reading!"
        else -> "Sleeping!"
    }
    println(res)
}