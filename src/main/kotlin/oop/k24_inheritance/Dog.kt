package kotl.oop.k24_inheritance

// Все классы по умолчанию final !
// Если мы хотим наследоваться от класса, то его нужно указать явно пометив ключ. словом open
// В Java мы вызываем конструктор супер класса
// В Kotlin все то же самое, но другим способом
class Dog(weight: Float) : Animal("Dog", weight, "Lands") { // не можем написать var weight: Float, потому что это поле уже есть в Animal

    // переопределение метода
    // все функции, как и классы, по умолчанию final !
    override fun eat() {  // для переопределения используем override
        println("Eating bone...")
    }
}
