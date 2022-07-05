package kotl.oop.k20_constructor

fun main() {
    val russia = Country(name = "Russia", population = 130_000_000L)
    println("${russia.name} ${russia.population}")

    val someCountry = Country() // secondary constructor
    println("${someCountry.name} ${someCountry.population}")


    val book = Book("Kotlin for Java Developers", 2014, 15.0)
    println("Book ${book.name} ${book.year} ${book.price}")
}