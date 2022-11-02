package lectures.part2oop

import lectures.part2oop.Objects.Person

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"

    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, iDCard: String) extends Person(name, age)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType = "domestic"

    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //type substitution - polymorphism
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overriding vs overloading

  //preventing overrides
  //1 - final on member
  //2 - final on class
  //3 - (sealed before class) seal the class = extend classes in THIS FILE, prevent extension in other class
}