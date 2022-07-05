package kotl.oop.k26_smartcast_and_anonymous_class

// Мы можем переопределять не только методы, но и поля (в родительском классе их нужно пометить как open, а в дочернем override)
// переопределяем переменную name (у Transport она val, а это значит, что у этого поля есть геттер, но нет сеттера)
// переопределив у нас теперь сеттер и геттер на это поле
class Car(override var name: String = "CAR") : Transport(name) { // переопределили val на var
    override fun drive() {
        println("Car is ridding...")
    }

    fun startEngine(): Boolean {
        println("Starting of engine...")
        return true
    }
}
