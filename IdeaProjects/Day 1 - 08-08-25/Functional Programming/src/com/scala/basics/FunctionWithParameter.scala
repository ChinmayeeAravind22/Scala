package com.scala.basics

object FunctionWithParameter {
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    val sum = add(5, 7)  // Passing parameters to the function
    println(s"The sum is: $sum")
  }
}

