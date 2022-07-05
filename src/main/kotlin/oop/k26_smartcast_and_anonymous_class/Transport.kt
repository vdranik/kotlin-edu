package kotl.oop.k26_smartcast_and_anonymous_class

abstract class Transport(open val name: String) { // val name - есть геттер, но нет сеттера
    abstract fun drive()

}
