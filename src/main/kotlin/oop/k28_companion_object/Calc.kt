package kotl.oop.k28_companion_object

class Calc {

    val a = 10

    // companion object это объект, который относится к классу, в котором он объявлен, он всегда существует, его не нужно создавать отдельно
    // все члены companion object не могут обращаться к полям класса Calc
    companion object {

        fun square(num: Int) = num * num // + a //не имеют доступа к полям объекта


        const val PI = 3.14 // константа, может быть объявлена только внутри companion object, аналог public static final в Java
        // когда создаем переменную как val, она не public, a private, и для нее создается public getter
        // у const нет getter'a
        // get() = field *2 - ошибка, нет возможности переопределить геттер

        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }

}
