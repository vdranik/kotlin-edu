package kotl.oop.k26_smartcast_and_anonymous_class

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()

//    car.name="Машина2"  // не смотря на переопределение поля м все равно не можем присвоить новое значение, все потому что car приведен к родительскому типу Transport

//    if(car is Car){                       // SMARTCAST v1  можем сделать так
//        car.name = "NEW CAR NAME"
//    }




//    if(car !is Car) return                // SMARTCAST v2 если переменная car не явл. типом Сar - выходим из метода и остальной код выполнятся не будет
//    car.name = "NEW CAR NAME"



//    if(car is Car && car.startEngine())   // SMARTCAST v3.1 напрямую не можем вызвать car.startEngine() (car приведен к родительскому типу Transport), в условии if мы можем совместить смарткаст и вызов метода
//    println(car.name)
//
//
//    if(car !is Car || car.startEngine())   // SMARTCAST v3.2
//    println(car.name)



    travel(car)
    //  но допустим мы еще не создавали car (и вообще, этот объект нам нужен только один раз)
    //  создадим
    // анонимный класс прямо внутри метода
    travel(object : Transport("Anonymous transport") { // object - объект анонимного класса // т.к. Transport содержит конструктор необходимо передать ему параметры
        override fun drive() {
            println("${this.name} is ridding...")
        }

    })


    // задача - есть спортсмен, у него есть метод вызов водоноса
    // в этот метод передаем объект водоноса, а у него в свою очередь берем воды
    val sportsman = Sportsman()
    sportsman.invokeWaterBoy(object : WaterBoy {                // версия с интерфейсом
        override fun bringWater() {
            println("Water is delivered!")
        }
    })

    // вариант с лямбда-выражением
    sportsman.invokeWaterBoy { println("Water is delivered!") } // версия с функцией, обходимся без интерфейса
}

fun travel(transport: Transport) {
    transport.drive()
}
