fun main(args: Array<String>) {
    val  obj1 = Person("George",23)
    println(obj1.name)
    println(obj1.age)
    println(obj1.canVote(23))
    val obj2 = (Person("Esther",33))
    println(obj2.name)
    println(obj2.age)
    println(obj2.canVote(33))
    val obj3 = Person("Stephen",13)
    println(obj3.canVote(13))
//instance of class Bulb
    val bulb1 = Bulb()
    bulb1.turnOn()
    println(bulb1.displayBulbstatus())
    bulb1.turnoff()
    println(bulb1.displayBulbstatus())
    val bulb2 = Bulb()
    bulb2.turnoff()
    println(bulb2.displayBulbstatus())
    bulb2.turnoff()
    println(bulb2.displayBulbstatus())
    val animal = Animal()
    animal.isbrown
    println(animal.displayAnimalstatus())
    animal.isbrown
    println(animal.displayAnimalstatus())

}
class Person(var name: String,var age:Int){
    fun canVote(age: Int){
        if(age>18){
            println("You can vote")

        }else{
            println("You can vote")
        }
    }

}
class Bulb(){
    var ison: Boolean=false
    fun turnOn(){
        ison = true
    }
    fun turnoff(){
        ison = false
    }
    fun displayBulbstatus(){
        if (ison==true){
            println("Bulb is on")
        }else{
            println("Bulb is off")
        }

    }
}
class Bulb2(){
    var ison: Boolean=false
    fun turnOn(){
        ison = true
    }
    fun turnoff(){
        ison = true
    }
    fun displayBulbstatus(){
        if (ison==true){
            println("Bulb is on")
        }else{
            println("Bulb is off")
        }
    }

}
class Animal(){
    var isbrown: Boolean=false
    fun brown(){
        isbrown = true

    }
    fun displayAnimalstatus(){
        if (isbrown==true){
            println("The cat is brown")

        }else{
            println("The cat is black")
        }
    }
}
