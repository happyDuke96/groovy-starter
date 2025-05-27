package loops


class LoopRunner {

    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5]

//        for (i in 0..<list.size()) { // alternative increment for statement in java
//            println list[i]
//        }
//
//        for (i in list) {   // alternative forEach in java
//            println i
//        }
//
//        1.upto(list.size()) { value ->        // opinion with closure
//            println value
//        }
//
//        list.size().downto(0) {
//            println it
//        }

//        list.size().times {
//            println it
//        }

        1.step(5, 2) {
            println it      // print 1 and 3,skip by 2 count and not print 5 because 5 not existed
        }
        list.each { println it}

    }
}
