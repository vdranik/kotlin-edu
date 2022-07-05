package kotl.oop.k19_getters_setters

fun main() {
    val user = User() // в Kotlin ключевое слово new указывать не нужно

    // https://ru.stackoverflow.com/questions/1383051/%D0%9F%D1%80%D0%B8%D0%B2%D0%B0%D1%82%D0%BD%D1%8B%D0%B5-%D0%BF%D0%BE%D0%BB%D1%8F-%D0%B2-%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D0%B5

/*  // Java style
    user.setAge(35)
    user.setName("Vova")
    println("Name ${user.getName()} Age ${user.getAge()}")
 */

    // Kotlin style
    user.age = -15   // сеттер age переопределен
    user.name = null // геттер name переопределен


    println("Name ${user.name} Age ${user.age}")
    // Выгдядит так, что как буд-то мы обращаемся к public полям, что явл. нарушением инкапсуляции
    // но на самом деле тут нарушения нет
    // полями в Kotlin явл. свойствами (properties), каждое свойство имеет стандартный геттер и сеттер которые можно переопределить


    val user2 = User()
    user2.age = 10
    user2.age = 18
    user2.age = -9
    println(user2.age) // 18, т.к. сеттер переопределен и не может принимать орицательные значения, а последнее нормально присоенное значение 18


}
