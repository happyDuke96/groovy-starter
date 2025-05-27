package oop

class OopRunner {
    static void main(String[] args) {

        def user = new User()
        user.firstName = "Abbos"  // auto called setter method
        println user.firstName // autoCalled getter method
        println user['firstName'] // called getter method
        println user.'firstName' // called getter method
        println user.@firstName // directly accessing to field,not recommend


        def user1 = new User(firstName: "Abbos", lastName: "Abbos", age: 56) // create user object using map
        println user1

        User user2 = ["Abbos", "Abbos123", 42] // create user object using array,with overloaded constructor
        println user2

        def (firstN, lastN) = user2 // for working multiple assignments getAt method should be declared
        println firstN
        println lastN

        [user1, user2].collect { it.firstName } == ["Abbos"] // collecting to collection
        [user1, user2]*.firstName == ["Abbos"] // collecting to collection using spreed operator
    }
}
