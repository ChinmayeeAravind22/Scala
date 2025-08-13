package com.scala.basics

object LargestOfThree {
  def main(args: Array[String]): Unit = {
    val a = 12
    val b = 25
    val c = 9

    val largest = if (a >= b && a >= c) a
    else if (b >= a && b >= c) b
    else c

    println(s"Largest number is: $largest")
  }
}
