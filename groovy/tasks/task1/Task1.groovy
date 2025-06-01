package tasks.task1

import oop.User


/**
 * 1. Добавить метод инициализации "make" для создания объектов любых классов.
 Метод должен проксировать вызов на соответствующий конструктор
 * */
class Task1 {

    static void main(String[] args) {

        Class.metaClass = { Object[] values ->
            println thisObject
            println owner
            println delegate

            delegate.metaClass.invokeConstructor(values) // only delegate can inject make functional for classes
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 4])
        def user1 = User.make("Abbos", "Abbos", 20)
        def user2 = User.make()

        println hashSet
        println user1
        println user2

    }
}
