package contidtion;

public class Person {

    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    // InvokerHelper class of Groovy use this method for checking
    public boolean asBoolean() {
        return this.id > 5;
    }

    public Integer getId() {
        return id;
    }
}
