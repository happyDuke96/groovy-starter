package list

class ListRunner {

    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5, 6]

        assert list[0] == 1
        assert list.get(2) == 3
        assert list[1..3] == [2, 3, 4]
        assert list[20] == null

        //write operation

        list += 7 // add
        list << 8 << 9 << 10 << 10 // multiple add
        assert list == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10]
        list -= 10 // remove all 10 numbers
        assert list == [1, 2, 3, 4, 5, 6, 7, 8, 9]
        list -= [1, 3] // remove all numbers 1 and 3 in array
        assert list == [2, 4, 5, 6, 7, 8, 9]
        list *= 3
        assert list == [2, 4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9]

        // methods from queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 2
        assert list.tail() == [4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9]
        // tail return all elements except head\

        // flatten(flatMap in JavaScript), reverse,intersect,disjoint
        assert [1, 2, [3, 4, 5], 6].flatten() == [1, 2, 3, 4, 5, 6]
        assert [3, 2, 1].reversed() == [1, 2, 3]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6])

        // new operators
        def (a, b, c) = [5, 6, 7, 89, 10]
        assert a == 5
        assert b == 6
        assert c == 7

        // spreed operator '*'

        func(*[1,2])

    }

    static def func(def a, def b) {
        println a
        println b
    }
}
