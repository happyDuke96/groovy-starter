package categories

import oop.User

@Category(User.class)
class DefaultUserMethods {

    def testMethod() {
        println "$age, $firstName"
    }

    def static anotherMethod(User self, Object value) {
        println "Users property age: $self.age and param from method $value"
    }
}
