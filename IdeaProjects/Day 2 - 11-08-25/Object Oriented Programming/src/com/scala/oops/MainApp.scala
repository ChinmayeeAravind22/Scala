package com.scala.oops

object MainApp {
  def main(args: Array[String]): Unit = {
    println("=== Encapsulation ===")
    val e = new Encapsulation
    e.deposit(100)
    println(e.getBalance)

    println("\n=== Inheritance ===")
    val d = new Dog
    d.sound()

    println("\n=== Abstraction ===")
    val c = new Circle(4)
    println(c.area())

    println("\n=== Polymorphism ===")
    val printers: List[Printer] = List(new TextPrinter, new ImagePrinter)
    printers.foreach(_.print())
  }
}
