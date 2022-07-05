package kotl.oop.k21_methods


fun main() {
    val cat = Cat("Barsik", 8, 3f)
    cat.printInfo()

    // println(cat.isOld()) // в данном случае isOld ничего не делает, а скорее явл. свойством объекта чем действием

    println(cat.isOld)   // потому лучше добавить как свойство(поле) в класс
    cat.age = 15
    println(cat.isOld)  // все равно вернет false, т.к. в классе мы явно указали, какое значение присвоить переменной isOld
    // сначала проинициализировали все поля конструктора, а также поле val isOld вне конструктора
    // чтобы это работало правильно, значение должно обрабатываться в момент обращения к этой переменной
    // для этого мы не присваиваем значение val isOld = age >= 12 однократно, а создаем геттер

    // каждый раз когда создаем метод, нужно хорошо подумать - это метод или же мы показываем какое-то свойство объекта?

    // если значение переменной зависит от других переменных - то нужно переопределить геттер, чтобы он в любой момент возвращал правильное значение


    val employee = Employee("Vova", "programmer", 2015)
    employee.printInfo()
    println("Experience: ${employee.experience}")

    hello(null)
}


// если мы не можем изменить класс, мы можем расширить его с помощью extension function
//fun Cat.isOld() = age >= 12


fun Employee.printInfo() {
    println("Name: $name, Position $position, Start year $startYear")
}


fun hello(line: String? = "HELLO"){
    print(line)
}
