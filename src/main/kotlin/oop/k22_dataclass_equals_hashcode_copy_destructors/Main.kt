package kotl.oop.k22_dataclass_equals_hashcode_copy_destructors

// В Java знак == означает сравнение ссылок, а equals сравнивает сами объекты
// если equals не переопределять, то по умолчанию, в Object equals использует ==
// Объекты сравниваем через equals, примитивы чрез ==   (т.к. примитивы (как и ссылки) лежат в стеке)

// В Kotlin == означает сравнение объектов (как equals в Java) и === сравнение ссылок!!!

fun main() {
    val student1 = Student("Ivan", "Ivanov", "12345")
    val student2 =
        student1.copy() // копирует объект, но при этом создается абсолютно новый объект, сравнение по ссылкам вернет false

    // можно копировать объект частично
    val student3 = student1.copy(name = "Vova") // копируем все поля, кроме name (name используем свое)
    println(student3)


    println(student1) // вызыв. toString
    println(student2) // вызыв. toString

    println(student1.hashCode()) // у любого объекта можно вызвать hashcode
    println(student2.hashCode()) // объектов может быть сколько угодно, а hashcode всего около 2млрд (Int)
    // если переопределяем equals, то и hashcode надо переопределить

    println(student1 == student2) // сравнение объектов!
    println(student1.equals(student2)) // устаревший стиль сравнения объектов


    println(student1 === student2) // сравнение ссылок!

    // Деструктор - если хотим получить из объекта набор переменных (сразу работает с data классами, с обычными классами необходимо переопределять компоненты)
    val (name: String, lastName: String, id: String) = student1 // деструктор класса (не уничтожает объект, а просто изымает поля)
    println(name)
    println(lastName)
    println(id)

    // если нам не нужен какой-либо аргумент, ставим _
    val (name2, _, id2) = student2
    println(name2)
    println(id2)


}
