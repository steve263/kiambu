fun main(args: Array<String>) {
    println(birthdayGreeting("Stephen",22,"Kasarani"))
    println(birthdayGreeting("Esther",16,"marsabit"))
    println(birthdayGreeting("Kamau",33))
    println(calculateArea(8.0,3.9))
    println(calculateAreaCircle(3.142,3.5))


}
fun birthdayGreeting(name: String,age:Int,location:String="Nairobi"): String{
    val a = "Happy birthday $name"
    val b = "You are $age years old"
    val c = "You are celebrated"
    val d = "This comes from $location"
    return "$a\n$b\n$c\n$d"
}
fun calculateArea(length: Double,width:Double): Double{
    return length * width
}
fun calculateAreaCircle(pie:Double,radius:Double):Double{
    return pie*radius*radius
}
fun calculateBMI(height:Int=2,weight:Int=60):Int{
    return height * weight
}