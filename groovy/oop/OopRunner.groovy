package oop

class OopRunner {
    static void main(String[] args) {

        def user = new User()
        user.firstName = "Abbos"  // auto called setter method
        println user.firstName // autoCalled getter method
        println user['firstName'] // called getter method
        println user.'firstName' // called getter method
        println user.@firstName // directly accessing to field,not recommend


        def user1 = new User(firstName: "Abbos", lastName: "Abbos", age: 56,id: 123) // create user object using map
        println user1

        User user2 = ["Abbos", "Abbos123", 42] // create user object using array,with overloaded constructor
        println user2

        def (firstN, lastN) = user2 // for working multiple assignments getAt method should be declared
        println firstN
        println lastN

        assert [user1, user2].collect { it.firstName } == ["Abbos","Abbos"] // collecting to collection
        assert [user1, user2]*.firstName == ["Abbos","Abbos"] // collecting to collection using spreed operator

        // Mixin in Groovy
        String.mixin(OopRunner.class) // in this case using mixin() we can add custom function to existing class

        // work only after mixin() method
        println "Abbos".printStr()
        println "Abbos Abdukhakimov".printStr()
    }

    static def printStr(String self) { // by default param named self,but we can change it
        "It`s my name $self"
    }

    static def printMultipleStr(String firstName, String lastName) {
        "My full name is $firstName $lastName"
    }


}
