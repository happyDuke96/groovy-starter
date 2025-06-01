package closure

import oop.User

class SecondClosureRunner {

    static void main(String[] args) {
        def user = new User(firstName: "Abbos", lastName: "Ab",age: 20)

        println user

        Closure closure  = {
            firstName = "Sardor"
        }

        println closure.thisObject // == this
        println closure.owner // in which class created
        println closure.delegate // for manual change

//        closure.delegate = user
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

        // alternative for all bottom method
        user.with closure


        println user

    }
}
