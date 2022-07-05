package kotl.oop.k25_abstract_class_interface_instanceOf_is_as

fun main() {

    val programmer = Programmer("Ivan", 35, "Java")
    val seller = Seller("Petr", 44)

    programmer.work()
    programmer.breakTime()


    seller.work()
    seller.breakTime()
    seller.clean()

    val workers = mutableListOf<Worker>(programmer, seller)
    workers.add(programmer)



    workers.forEach {
        // workers.clean() // не можем так сделать так как worker это родительский класс и там нет метода clean()

        it.work()
        if (it is Cleaner) {  // SMART CAST - аналог instanceOf, приводить к типу (как в Java) ненужно, приведение типов тут работает автоматически, неявное
            it.clean()  // тут уже можем вызвать clean(), хотя "вроде как" это еще worker (IDEA нам подсвечивает смарт каст зеленым)
        }

        if (it is Programmer) {
            println(it.language)
        }

//        it as Cleaner // явное! преобразование типа к Cleaner
//        it.clean()    // но в этом цикле выпадет ClassCast Exception когда попадется другой тип
    }


    // из коллекции работников фильтруем уборщиков
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner } // as явно преобразуем

    cleaners.forEach {
        it.clean()
    }


}

