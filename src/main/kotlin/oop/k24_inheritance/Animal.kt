package kotl.oop.k24_inheritance

// Все классы по умолчанию final !
// Если мы хотим наследоваться от класса, то его нужно указать явно пометив ключ. словом open
open class Animal(val name: String, var weight: Float, val habitat: String) {


    // переопределение метода
    // все функции, как и классы, по умолчанию final !
    open fun eat() {
        println("Eating...")
    }

    open fun run() {
        println("Running...")
    }

}
