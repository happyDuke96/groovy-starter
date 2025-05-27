package regex

import java.util.regex.Matcher
import java.util.regex.Pattern

class GroovyRegexRunner {

    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
        String regex = "(\\w+) (\\d+)" // -- in Java with grouping

        Pattern pattern = Pattern.compile(regex)

        Matcher matcher = pattern.matcher(value)

        println matcher.matches() // checking to full text matching

        // in Java
        while (matcher.find()) {
            println matcher.group()
            println matcher.group(1)
            println matcher.group(2)
            println '---------------------'
        }

        // Groovy case

        String regex2  = /(\w) (\d)/ // -- in Groovy
        Pattern pattern2 = ~ regex2

        // alternative for Java --> Pattern.compile(regex)
        Matcher matcher2 = value =~ regex2
        // alternative for Java --> matcher.matches()
        boolean result = value ==~ regex

        println 'Groovy matcher with array alternative while loop'
        println matcher2[0]
        println matcher2[1] [2]
        println matcher2[1..2]

        println 'Groovy matcher with Clojure alternative while loop'
//        matcher2.each(group -> println group)
        matcher2.each((group1,group2,group3) -> {
            println group1
            println group2
            println group3
        })

    }
}
