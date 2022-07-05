package kotl.oop.k31_generic_functions_and_lateinit_var

fun main() {
    val list: MyList<String> = MyArrayList.myListOf("word1", "word2", "word3") // тут нужно точно указать тип
    //val list: MyArrayList<Int> = MyArrayList.myListOf(1,2,3)
    for (i in 0..100) {
        list.add("$i")
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }

    val dog = Dog()
    dog.printA()
}
