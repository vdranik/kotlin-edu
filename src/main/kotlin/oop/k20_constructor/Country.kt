package kotl.oop.k20_constructor

// В Kotlin есть 2 типа конструкторов
class Country(         // первичный конструктор
    val name: String,  // с val будут доступны только геттеры, с var - и геттеры и сетттеры
    val population: Long
) {  // Primary constructor - создается сразу при создании класса, все поля которые передали, проинициализируются при создании объекта

    // Secondarн constructor - при создании вторичного конструктора мы обязаны вызвать первичный
    // а это значит, что мы должны проинициализировать наши 2 поля значениями
    constructor() : this("", 0L) { // this - вызов первичного конструктора

    }

    // тут лучше всего будет использовать default параметры!
    // class Country(val name: String = "", val population: Long = 0L)


}
