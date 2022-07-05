package kotl.oop.k19_getters_setters

class User {

/*  // Kaк бы мы делали в Java
    private var age:Int = 0
    private var name:String? = null;

    В Java нам необязательно определять поля сразу, компилятор назначит для Int 0, а для String null
    в Kotlin мы должны сами указывать значение по умолчанию!


    // в Kotlin не нужно явно создавать геттеры и сеттеры
    // по умолчанию в Kotlin все функции public (можно не писать)
    fun setAge(age:Int){
        this.age = age
    }

    fun getAge() = age

    fun setName(name:String){
        this.name = name
    }

    fun getName() = name
 */

    // Kotlin style
    var age: Int = 0
        set(value) {        // переопределение сеттера
            if (value >= 0) {
                field = value
            }
        }

    var name: String? = null
        get() {   // переопределение геттера поля name, пишем сразу после поля
            return if (field == null) {
                ""
            } else {
                field
            }
        }

}
