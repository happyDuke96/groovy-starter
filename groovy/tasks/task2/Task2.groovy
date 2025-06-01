package tasks.task2


/**
 *    2. Добавить возможность складывать различные единицы измерения.
 Например: 3.cm + 1.m - 25.mm = 1005 (mm)
 * */
class Task2 {

    static void main(String[] args) {

        // only delegate import or inject value of classes
        Integer.metaClass {
            getCm = {
                delegate * 10
            }
            getM = {
                delegate.cm * 100
            }
            getMm = {
                delegate
            }
        }
        def result = 3.cm + 1.m - 25.mm

        println result
        assert result == 1005

    }

    // using categories change Integer behavior
    static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm

            println result
            assert result == 1005
        }
    }
}
