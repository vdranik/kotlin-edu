package kotl.oop.k29_singleton


/*
// 1. Нужно запретить создавать объекты этого класса, конструктор должен быть приватным
class Database private constructor(){
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

    companion object {

        var db: Database? = null
        // 2. Создаем геттер, т.к. конструктор приватный мы можем к нему обращаться только внутри данного класса, но
        // так как этот метод привязан не к объекту, а к классу, мы можем получить его извне
        fun getInstance(): Database {

            // если переменная не равна null, нам вернется ее значение и код дальше выполняться не будет
            db?.let{
                return it
            }

            // а если равна null, то создаем новый объект
            val instance = Database()
            db = instance
            return instance
        }
    }
}*/

// Что-то вроде глобального объекта
// короткая форма
// у object не может быть конструктора и companion object, т.к. это не класс и он сам явл. объектом
// синхронизация тут не нужна, object синхронизирован
object Database {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}
