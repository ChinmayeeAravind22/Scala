package com.scala.basics

object CurriedFunction {
    def add(a: Int)(b: Int): Int = {
      a + b
    }

    def main(args: Array[String]): Unit = {
      val addFive = add(5) _ //partial application
      val sum = addFive(3)
      println(s"The sum is $sum")
    }
  }


