package closure

import java.util.function.Function
import java.util.stream.Stream


/**
 * Closure is dynamic general-purpose language combining interactive development of script language,
 * Closure work looks like Functional interfaces in Java
 * */
class FirstClosureRunner {

    static void main(String[] args) {

        Function func = value -> value + value
        Closure closure = value -> value + value


        Stream.of(1, 2, 3, 4)
//                .map(func) // -- alternative in Java
                .map(closure)
//                .map(String::valueOf) // -- alternative in Java
                .map(String.&valueOf)
                .forEach(System.out::println)

        int x = 10
//        check(x > 0, { ++x })

        // именно за такой функционал Groovy распространен в Gradle и Jenkins
        check(x > 0) {
            ++x
            println x
        }

        println x
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
