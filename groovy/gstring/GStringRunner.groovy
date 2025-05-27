package gstring
/**
 * Groovy String declaration
 * Simple like as Java ->   " "
 * --> ' '
 * --> """  """
 * --> ''' '''
 * --> /  / -- used in RegEx
 * --> $/  /$ -- used in RegEx
 * */

name = "Abbos"

value = 'Hello "Abbos"'

value1 = "Hello $name"

value2 = """
SELECT *
FROM
table WHERE name = $name
"""

value3 = '''
SELECT *
FROM
table WHERE name = abbos
'''

value4 = /Hello $name/
value5 = $/Hello $name /$

value6 = "Hello ${getNameWithPrefix(name)}"

println name

println value
println value1
println value2
println value3
println value4
println value5
println value6

// for declare char with ' ' need specified explicitly keyword char
char symbol = 'A'


def getNameWithPrefix(String name) {
    "prefix-" + name
}



