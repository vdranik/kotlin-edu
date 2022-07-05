package kotl.oop.k29_singleton

class Test {
    fun insertTestData(string: String) {
        //Database.getIstance().insertData(string)
        Database.insertData(string)
    }
}
