package com.scala.basics

object FunctionWithReturnType {
  def multiply(a: Int, b: Int): Int = {
    a * b
  }

  def main(args: Array[String]): Unit = {
    val result = multiply(4, 3)
    println(s"The product is: $result")
  }
}
