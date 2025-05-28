package iorunner

import groovy.io.FileType

class IORunner {

    static void main(String[] args) {

        // in Groovy we dont need delete file after used and all function with file present in class File
        def file = new File(".gitignore")

        // 1 way print
//        println file.text

        // 2 way print
//        file.each {line -> println line}

        // 3 way print,in this case we dont need close stream
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try(def reader = file.newReader()) { // in this case we need close reader because we create 'newReader' not 'withReader'
            writer << reader // write to in memory writer from reader
        }


        def file2 = new File("text.txt") // automatically create file
        file2.text = "First text" // add to file this text
        file2 << System.lineSeparator() << "Second text from new line" // append existing file

//        file2.withOutputStream {} // --> create stream and should be closed after used
//        file2.newOutputStream() // --> not need close,resource closed automatically


        def groovyDir = new File("groovy")
        groovyDir.eachDirRecurse { println it}
//        println srcDir.eachDirRecurse { println it } // for iterate inner packages
//        println groovyDir.eachFileRecurse { println it } // for iterate inner files

        groovyDir.eachFile(FileType.FILES) { println it} // iterate with type

    }
}
