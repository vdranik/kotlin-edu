package kotl.oop.k21_methods

class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    //val isOld = age >= 12 // это не функ, а свойство у которого есть геттер, но нет сеттера, т.к. оно val, тут происходит однократное присвоение

    val isOld: Boolean // эта переменная неизменяема, мы не можем присвоить значение сами, но когда мы будем дергать эту переменную, с явным геттером оно будет каждый раз пере высчитываться
        get() = age >= 12

    fun printInfo() {
        println("Can name $name, age $age, weight $weight")
    }

//    fun isOld() = age >= 12
}
