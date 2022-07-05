package kotl.oop.k26_smartcast_and_anonymous_class

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }


    // если оставим без inline, то под капотом будет та же реализация, что методом выше, что не оптимизированно
    // с inline объект анонимного класса вызван не будет, а просто отработает функция
    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}
