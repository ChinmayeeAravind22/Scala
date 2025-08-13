package com.scala.oops

abstract class Shape {
  def area(): Double
}

class Circle(radius: Double) extends Shape {
  override def area(): Double = Math.PI * radius * radius
}

object Abstraction {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(5)
    println(f"Circle area: ${circle.area()}%.2f")
  }
}
