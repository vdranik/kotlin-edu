package kotl.oop.k25_abstract_class_interface_instanceOf_is_as

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {

    override fun work() {
        println("I'm writing code on $language")
    }

    override fun breakTime() {
        println("Programmer break time")
    }

}
