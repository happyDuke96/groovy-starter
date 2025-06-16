package DSL

class DSLBuilder {

    static MailSpecification mail(@DelegatesTo(MailSpecification) Closure closure) {
        def mailSpecification = new MailSpecification()
        // more verbose way to delegate
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure

        // best way to delegate
        mailSpecification.with closure
        println mailSpecification
        mailSpecification
    }
}
