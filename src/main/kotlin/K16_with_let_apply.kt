package kotl

private var name: String? = null
val mutList: MutableList<Int>? = mutableListOf()

// Функции высшего порядка - это функции, которые принимают другие функции в качестве параметра (или возвр. другую функцию)
// let и with относятся к любым объектам в котлин
fun main() {

    //1
//    if(name?.length?.compareTo(5) == 1){ // сравниваем длину строки(нулабельного типа) с 5 - вышло довольно сложно и громоздко
//        println("Hello")
//    }

    //2й вариант - добавляем в начале проверну на null
//    if(name == null){         // эта проверка ничего не дает, т.к. name может біть изменена в другом потоке
//        return
//    }
//
//    if(name!!.length > 5){    // грязное решение, если уверены что не будет 2го потока который может изменить значение
//        println("Hello")
//    }

    //3
    // Функцию высшего порядка let можно вызвать у абсолютно любого обьекта
    name?.let {   // let принимает функцию, эта функ. принимает тип String (поскольку вызвали у переменной String), если name == null, то ничего выполняться не будет
        if (it.length > 5) { // it и есть name
            println(it)
        }
    }


    //1
//    val list = mutableListOf<Int>()
//    for (i in 0 until 1000) {
//        list.add((Math.random() * 1000).toInt())
//    }
//    println(list.sum())
//    println(list.average())
//    println(list.minOrNull())
//    println(list.maxOrNull())
//    println(list.first())
//    println(list.last())  // здесь мы упомянули 7 раз переменную list (вместе с объявлением)

    // используем with когда нужно провести множество операций с одним объектом
    val list = mutableListOf<Int>()   // а с with мы ее используем лишь в объявлении
    with(list) {                      // в качестве параметра принимает любой объект и к нему можно обращаться чрез this (this МОЖНО НЕ УКАЗЫВАТЬ!)
        for (i in 0 until 1000) {
            this.add((Math.random() * 1000).toInt()) // this можно не указывать
        }

        println(sum())
        println(average())
        println(minOrNull())
        println(maxOrNull())
        println(first())
        println(last())

    }

    // TODO add apply method

// запонить нулабельную коллекцию и вывести первые 100 четных чисел
    mutList?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }

            val result = filter { it % 2 == 0 }.take(10)
            for (i in result) {
                println(i)
            }
        }
    }
}