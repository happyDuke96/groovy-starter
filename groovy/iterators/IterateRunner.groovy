package iterators

import switchs.Employee

class IterateRunner {

    static void main(String[] args) {

        assert [1, 2, 3, 4, 5].any { it % 2 == 0 }
        assert [1, 2, 3, 4].find { it % 2 == 0 } == 2
        assert [4, 5, 7, 8, 9, 0, 2, 10].findAll { it % 2 != 0 } == [5, 7, 9]
        assert (2..4).collect() == [2, 3, 4] // collect to collection

        def employee = new Employee("Abbos")
        employee.each { println it }

        assert ["qw", "ert", "y12", "456", "778"].grep(~/\d+/) == ["456", "778"] // called isCase method and contain filter for
        assert ["qw", "ert", "y12123", "456", "778"].grep { it.length() > 4 } == ["y12123"]


    }
}
