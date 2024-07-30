import java.util.Scanner

fun main(args: Array<String>) {
    var name = "George"
    println(name)
    var age: Int = 34
    var name2: Boolean = true


    println(name2)
    var school = "emobilis"
    println(school)

    val birthdate = 2007
    println(birthdate)
    val age1 = 34
    val age2 = 45

//    val total = age/age2
//    println(total)
//    println(age1)
//     val marks = 71
//    val marks2 = 83
//    val summation = marks+marks2
//    println("Your total marks is $summation")

    println("Where do you stay?")
    var enteredstay = readln()
    println("How many children do you have? ")
    var enteredchildren = readln()
    println("I stay in $enteredstay with $enteredchildren children")
val read = Scanner(System.`in`)
    println("How many cars do you have")
    var entercars = readln()
    println("How much is your salarry")
    var enteredsalary = readln()
    val summation = entercars+enteredsalary
    println(" The total numbers of cars i have is $entercars and my salary is $enteredsalary $summation")



    println("Which were you born")
    var enteryear = readln()
    var year = 2024

    println("I was born in $enteryear $year")





}