package ranges


/**
 * Ranges also implement isCase and contains method for working with if and switch statement
 * */
class RangeRunner {

    static void main(String[] args) {
        def range = 2..9

        assert range.getClass() == IntRange // by default rages is IntRange

        assert range.get(2) == 4
        assert range.contains(4)

        range.each { println it}

        ('a'..'g').each { println it}

        (WeekDay.MONDAY..WeekDay.FRIDAY).each { println it}  // word it reserved symbol in Groovy

        (WeekDay.SUNDAY..WeekDay.WEDNESDAY).each { println it} // reversed version
    }
}
