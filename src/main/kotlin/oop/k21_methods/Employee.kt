package kotl.oop.k21_methods

import java.util.*

class Employee(val name: String, val position: String, val startYear: Int) {
    // стаж ничего не делает, а показывает свойство объекта, потому создаем свойство, а не метод
    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Working...")
    }
}

