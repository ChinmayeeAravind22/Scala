package com.scala.basics


  import scala.io.StdIn._

  object ConsoleInputOutput {
    def main(args: Array[String]): Unit = {

      print("Enter your name: ")
      val name = readLine()

      print("Enter your age: ")
      val age = readInt()

      print("Enter your height (in cm): ")
      val height = readFloat()

      print("Enter your weight (in kg): ")
      val weight = readDouble()

      print("Enter your gender (M/F): ")
      val gender = readChar()

      print("Are you a student? (true/false): ")
      val isStudent = readBoolean()


      println("\n=== User Details ===")
      println(s"Name    : $name")
      println(s"Age     : $age")
      println(f"Height  : $height%.2f cm")
      println(f"Weight  : $weight%.2f kg")
      println(s"Gender  : $gender")
      println(s"Student : $isStudent")
    }
  }


