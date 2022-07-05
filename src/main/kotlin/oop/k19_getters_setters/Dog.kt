package kotl.oop.k19_getters_setters

class Dog {
    // в отличие от Java мы должны сразу инициализировать переменные, а если они null то нужно сделать их нуллабельными
    var name: String = ""
        get() = name.toLowerCase().capitalize()

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Float = 0F
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

}
