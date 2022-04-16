#!/bin/groovy

//methods of variable(string) declaring
String var1 = 'var1'
def var2 = "jo"
var3 = '3rd method assigning variable'
def String var4 = 'one more'

println var1
println var2
println var3
println 'def is better '+var2

println 'Variable is ${var4}'
println "Variable is ${var4}"

// tokenize - convert string to list
x = var3.tokenize(' ')
println x
