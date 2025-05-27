package contidtion


/** Groovy use asBoolean method for checking data inside if statement
 * asBoolean method check for this:
 * Collection/Map       is not empty
 * String/GString       is not empty
 * Number/Char          != null || != 0
 * references           != null
 * */
class ConditionRunner {

    static void main(String[] args) {

        int x = 10

        // in Java
//        boolean condition = x > 0
//        if (condition) {
//            println x
//        }

        if (x) {
            println 10
        }

        def person = new Person(6)
        if (person) {
            println person.getId()
        }

        // null safe in Groovy and simple ternary
        person?.getId()?.intValue()

        println x ?: 1

    }
}
