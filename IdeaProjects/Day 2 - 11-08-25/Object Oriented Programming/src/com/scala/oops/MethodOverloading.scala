package com.scala.oops

class MethodOverloading {
  def add(a: Int, b: Int): Int = a + b
  def add(a: Int, b: Int, c: Int): Int = a + b + c
  def add(a: Double, b: Double): Double = a + b
}

object MethodOverloading {
  def main(args: Array[String]): Unit = {
    val mo = new MethodOverloading
    println(mo.add(2, 3))
    println(mo.add(2, 3, 4))
    println(mo.add(2.5, 3.5))
  }
}
