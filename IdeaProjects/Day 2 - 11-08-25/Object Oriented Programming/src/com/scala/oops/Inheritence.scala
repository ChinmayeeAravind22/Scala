package com.scala.oops

class Animal {
  def sound(): Unit = println("Animal makes a sound")
}

class Dog extends Animal {
  override def sound(): Unit = println("Dog barks")
}

object Inheritance {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    val dogs = new Animal

    dog.sound()
    dogs.sound()
  }
}
