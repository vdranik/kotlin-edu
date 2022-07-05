package kotl.oop.k22_dataclass_equals_hashcode_copy_destructors

// у обычных классов не переопределены hashcode и equals
// В data class ПЕРЕОПРЕДЕЛЕНЫ: toString, hashcode, equals (==), copy, добавляет деструкторы
data class Student(val name: String, val lastName: String, val id: String) {

    // Деструкторы можно использовать без data, но тогда нужно добавить их вручную, их может быть сколько угодно
//    operator fun component1() = name  // надо дать понять компилятору, что это не просто обычные функции, а компоненты деструктора - добавляем operator
//    operator fun component2() = lastName
//    operator fun component3() = id

    // использование copy без data (по сути это конструктор)
//    fun copy(name: String = this,name: String, lastName = this.lastName: String, id: String = this.id): Student {
//        return Student(name, lastName, id)
//    }
}
