package missingMP

import oop.User

class MissingMethodPropertyRunner {

    static void main(String[] args) {

        def user = new User()

        user.testMethod(12)

        user.testProperty
    }
}
