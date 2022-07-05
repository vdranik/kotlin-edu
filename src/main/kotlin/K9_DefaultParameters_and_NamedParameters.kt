package kotl

fun main() {
    // named parameter
    printInfo(lastName = "Grozniy", name = "Ivan")
    println(volume(10, 20, 30))
}

// patronymic - default parameter
fun printInfo(lastName: String, name: String, patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("Last name $lastName")
    }

    if (name.isNotEmpty()) {
        println("Name $name")
    }

    if (patronymic.isNotEmpty()) {
        println("Partonymic $patronymic")
    }

}

// метод, который возвращает объем параллелепипеда
// если передана 1 сторона(параметр), то считается, что это куб
// если 2 стороны - то считается, что 1я и 3я стороны равны между собой
fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c