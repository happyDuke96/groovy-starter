package categories

import oop.User

class CategoriesRunner {

    static void main(String[] args) {

        def user = new User(age: 20, firstName: "Abbos")

        use(DefaultUserMethods.class) {
            // in this case using DefaultUserMethods add to MetaClass after scope will be deleted from MetaClass
            user.testMethod()
            user.anotherMethod("Test param")
        }

    }
}
