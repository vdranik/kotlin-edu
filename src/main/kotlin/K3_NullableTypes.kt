package kotl


// В Java абсолютно любой ссылочной переменно можно присвоить null

/* АБСОЛЮТНО! все типы в Kotlin не нулабельные, они не могут хранить в себе значение null
   private var name: String = null - так нельзя, тут обязательно должна лежать какая-то строка
   Если нам нужно иметь null, после указания типа мы ставим ?
 */
private var name: String? = null

fun main() {

    /* т.к. переменная name содержит null, то вызов метода length будет вызывать ошибку
       В отличие от Java этот код не скомпилируется

       Есть 2 подхода, как сделать так, чтобы такой код скомпилировался:
       1) name!!.length - НЕБЕЗОПАСНЫЙ ПОДХОД, используем только если на 100% уверены, что переменная имеет значение
       В этом случае, если name = null, то мы получим KotlinNullPointerException
       2) name?.length - безопасный подход, если name = null то метод length вызван не будет и будет возвращен null
     */

    // name?.length - вернет тип Int?
    val length: Int? = name?.length // т.к. эта переменная может быть null, мы обязаны указать тип переменной как нулабельный - Int?
    // name?.length?.toString() - вернет тип String?
    val stringLength = name?.length?.toString()
    val withW: String? = name?.plus("w") // метод будет вызван только в том случае, если переменная не равна null

    println(length)


    val notNullLength = name?.length ?: 0 // оператор элвис как дефолтное значение - будет null либо 0
    println("elvis operator result: $notNullLength")


    // ЗАДАЧА: вывести количество символов всех строк (разумеется null и число складывать нельзя)
    val a: String? = null
    val b: String? = "some_string"
    val c: String? = ""

    val result: Int = (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
    println(result)
}