package switchs

import java.util.stream.Stream

class SwitchRunner {
    static void main(String[] args) {
        def obj = new Employee("Abbos")
        long value = 10
        int value2 = 12

        switch (value) {
            case Employee:      // called isInstance method
                println "Employee class"
                break
            case String:
                println "String class"
                break
            case new Employee("Test"):      // called isCase() method
                println 5
                break
            case ~/\d+/:
                println "contained number with regex " + value     // Pattern.compile(value).matcher(10.toString()).matches()
                break
            case Long.class:
                println "Long class"
                break
            case [1,3,5,9]:
                println "contained in array"        // array.isCas(value)
                break
            case 5:             // checking to value with equals
                println 5
                break
            default:
                println "default"
                break
        }

        if (value2 in [1,2,3,5,12]) { // called isCase() method
            println "contained in array: " + value2
        }
    }

}

class Employee {
    private String name

    Employee(String name) {
        this.name = name
    }

    String getName() {
        return name
    }

    boolean isCase(Object switchValue) {
        println "invoke isCase: " + switchValue
        return false;
    }
}
