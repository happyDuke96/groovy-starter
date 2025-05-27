package map

class MapRunner {

    static void main(String[] args) {
        // initializing map

//        def map = [one: 1, two: 2] // we can declare without quotes Groovy pasted likes as String
        def map = ["one": 1, "two": 2]

        // read operators
        assert map.get("one") == 1
        assert map['one'] == 1
        assert map.one == 1 // works using propertyMissing method of MetaClass in Groovy
        assert map.get("qwe", 10) == 10 // getOrDefault value
        println map.one

        // write operators
        map.one = 11
        map.three = 3

        // new method
        assert map.subMap("one", "two") == ["one": 11, "two": 2]
        println map.subMap("one")

        // new operators with spreed
        def newMap = [*: map, "four": 4, "five": 5]
        println newMap

    }
}
