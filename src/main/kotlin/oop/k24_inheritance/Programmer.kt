package kotl.oop.k24_inheritance

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {

    override fun work() {
        println("I'm writing code on $language")
    }
}