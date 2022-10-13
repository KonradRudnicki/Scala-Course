package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck!?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    //task 1
    def +(addition: String) = new Person((name + s" ( $addition)"), favouriteMovie, age)

    //task 2
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    //task 3
    def learns(ability: String) = s"$name learns $ability"
    def learnsScala: String = this learns "Scala"
    //task 4
    def apply(number: Int) = s"$name watched $favouriteMovie $number times"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes ("Inception")) // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Inception")
  println(mary hangOutWith tom)

  // ALL operators are methods
  println(1 + 2)
  println(1.+(2))

  //prefix notation
  val x = -1
  val y = 1.unary_-
  // same value

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive) // only available with the scala.language.postfixOps import - discouraged

  //apply
  println(mary.apply())
  println(mary()) //equivalent

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
}