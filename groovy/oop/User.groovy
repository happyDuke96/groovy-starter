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
}
