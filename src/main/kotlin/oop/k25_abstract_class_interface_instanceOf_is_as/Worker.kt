package kotl.oop.k25_abstract_class_interface_instanceOf_is_as

// abstract запретит создавать абстрактных базовых воркеров
// этот класс просто базовый класс для других классов и мы запрещаем создавать его абстрактный экземпляр
abstract class Worker(val name: String, val age: Int) {
    open fun work() {
        println("Working...")
    }

    // теперь все наследники обязаны переопределить этот метод
    abstract fun breakTime()
}
