package kotl.oop.k29_singleton

fun main() {

    //val db = Database.getInstance()
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val test = Test() // имитируем вставку из другого места программы
    test.insertTestData("3")
    test.insertTestData("4")
    for(str in db.data){
        println(str)
    }
}
