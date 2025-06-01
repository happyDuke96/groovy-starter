package oop

import groovy.transform.ToString
import groovy.transform.TupleConstructor
import oop.trait_mixin.WithId

@ToString
@TupleConstructor
class User implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name/* method name*/, Object arguments) {
        println "invoke missing method $name with args: $arguments"
    }

    def propertyMissing(String name/* property name*/) {
        println "print missing property $name"
        "default property"
    }

    static def getInfo() {
        Closure closure = {
            println thisObject // get this (User)
            println owner // get owner creator class,in this case User
            println delegate // same owner

            Closure closure2 = {
                println thisObject // get this (User)
                println owner // get owner creator class and specific method,in this case getInfo method
                println delegate // get owner creator class and specific method,in this case getInfo method
            }
            closure2
        }
    }
}
