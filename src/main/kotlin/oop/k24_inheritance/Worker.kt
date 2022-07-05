package kotl.oop.k24_inheritance

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("Working...")
    }
}