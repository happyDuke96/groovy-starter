package metaClasses

import oop.User
import org.codehaus.groovy.runtime.DefaultGroovyMethods

import java.lang.reflect.Method

class MopRunner {

    static void main(String[] args) {

        def customMetaClass = new CustomMetaClass()
        println "Hello"

        // get Method from reflection,this method always need for dynamically add method to another classes
        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println",method)

        def user = new User()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(user /* this object looks like dummy*/,user,"test print from user println method") // this text will be printed and added in runtime

        // by default used MetaClassImpl
        println user.metaClass

        // ExpandMetaClass
        // after dynamically adding field or method  MetaClassImpl transformed to ExpandMetaClass
        user.metaClass.abs = "Test property" // add dynamically filed to user object
        println user.abs
        user.metaClass.testMethod = {
             "This new method created in runtime"
        }
        println user.testMethod()

        // adding method to object class of class
        user.class.metaClass.newMethod = { int value ->
            println "New method in class User, $value"
        }
//        user.newMethod() // throwing error,we cannot adding method to object class of class,because object already created
        new User().newMethod(100) // this will be work

        // thanks to this mechanism(dynamic programming) we can use mixin() and add new functional on runtime to existing class
    }
}
