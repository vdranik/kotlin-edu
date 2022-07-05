package kotl

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 0..1000) {
        names.add("Name$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val users = names.zip(phones) // объединяем массив  names с phones в List of Pairs
    for (user in users) {         // users: List<Pair<String>, <Long>>
        println("Name ${user.first}, phone ${user.second}")
    }

    // Создать пары ИМЯ ФАМИЛИЯ из обычного списка
    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Name$i Surname$i")
    }

    // вариант с zip
//    val nms = fullNames.map { it.substringBefore(" ")}
//    val surnms = fullNames.map { it.substringAfter(" ") }
//    val usrs = nms.zip(surnms)

    // вариант с map и Pair
    val usrs = fullNames.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (usr in usrs) {
        println("USR: ${usr.first}, ${usr.second}")
    }


}