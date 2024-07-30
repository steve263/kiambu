fun main(args: Array<String>) {
    val age = 20

    if (age>18){
        println("you are $age and so you can vote")
    }else{
        println("you are $age and so you are not allowed to vote")
    }
    val number = 4
    if (number==1){
        println("You lost the guess")
    }else if(number==2){
        println("You got it right")

    }else if(number==3){
        println("congratulation you got it right")
    }else{
        println("$number is not valid")
    }
//    when statement
    println("enter a number here")
    var enterednumber = readln()
val namba = 3
    when(namba){
        1 -> println("You lost the guess")
        2 -> println("You almost got it right")
        3 -> println("Congratulation you got it right")
        else -> println("$namba is not valid,please key"+"in a number between 1 and 3")
    }
    var myarray = arrayOf("opera","Chrome","Firefox","Safari","Brave")
    for (browser in myarray){
        println(browser)
    }
    var num = 4
    while (num<=10){
        println("loop: $num")
        num++
    }

}