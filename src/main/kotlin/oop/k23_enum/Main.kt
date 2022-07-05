package kotl.oop.k23_enum

import kotl.oop.k23_enum.Month.*
import kotl.oop.k23_enum.Season.*


fun main() {
/*    val nameOfMonth = "March"
        var season =
            when(nameOfMonth){
                "December", "January", "February" -> "WINTER" // такой подход плох тем, что мы не пере используем названия, и в случае рефакторинга придется менять все и везде
                "March", "April", "May" -> "SPRING"
                "June","July","August" -> "SUMMER"
                "September", "November", "October" -> "AUTUMN"
                else -> "No season"
            }
        println(season)
*/

    val nameOfMonth: Month = MARCH
    println(nameOfMonth.tempAverage)

    var season =
        when (nameOfMonth) {
            DECEMBER, JANUARY, FEBRUARY -> WINTER
            MARCH, APRIL, MAY -> SPRING   // если мы перечисли не все значения Month, в when нужно будет добавить else в конце
            JUNE, JULY, AUGUST -> SUMMER
            SEPTEMBER, NOVEMBER, OCTOBER -> AUTUMN
        }

    println(season)


    println(JANUARY.name)
    println("January".contains(JANUARY.name, ignoreCase = true))

}
