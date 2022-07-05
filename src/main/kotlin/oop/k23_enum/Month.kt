package kotl.oop.k23_enum

// В enum можно передавать параметры
// Если мы их объявили, их необходимо указывать
enum class Month(val tempAverage: Int) {
    JANUARY(0),
    FEBRUARY(-15),
    MARCH(-2),
    APRIL(5),
    MAY(15),
    JUNE(23),
    JULY(27),
    AUGUST(32),
    SEPTEMBER(24),
    OCTOBER(15),
    NOVEMBER(10),
    DECEMBER(0)
}
