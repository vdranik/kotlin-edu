package kotl.oop.k24_inheritance

fun main() {
    val dog = Dog(2F)
    println(dog.habitat)


    val worker1 = Programmer("Ivan", 35, "Java")
    val worker2 = Worker("Petr", 27)

    val workers = mutableListOf<Worker>(worker1, worker2)
    workers.forEach {
        it.work()
    }


}