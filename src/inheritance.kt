fun main(args: Array<String>) {
    val mathTeacher1 = MathTeacher("Stephen",44)
   println(mathTeacher1.TeacherMath())
    val mathTeacher2 = MathTeacher("Mary",33)
    println(mathTeacher2.TeacherMath())
    val ScienceTeacher = ScienceTeacher("carlos",45)
    println(ScienceTeacher.TeacherScience())
    val EnglishTeacher = EnglishTeacher("Alvin",24)
    println(EnglishTeacher.TeacherEnglish())
    val GeographyTeacher = GeographyTeacher("Daktari",23)
    println(GeographyTeacher.TeacherGeography())

}
open class Teacher(var name:String,var age: Int){
    init {
        println("My name is $name")
        println("I am $age years old")

    }
}
class MathTeacher(name:String,age:Int):Teacher(name,age){
    fun TeacherMath(){
        println("I teach Mathematics")
    }


}

class ScienceTeacher(name: String,age: Int):Teacher(name, age){
    fun TeacherScience(){
        println("I teach science")
    }

}
class EnglishTeacher(name: String,age: Int):Teacher(name, age){
    fun TeacherEnglish(){
        println("I teach English")
    }

}
class GeographyTeacher(name: String,age: Int):Teacher(name, age){
    fun TeacherGeography(){
        println("I teach Geo")
    }

}