package com.scala.studentmgmt

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    var continue = true

    while (continue) {
      println(
        """
          |--- Student Management Menu ---
          |1. Add Student
          |2. View All Students
          |0. Exit
          |""".stripMargin)

      print("Enter your choice: ")
      val choice = readInt()

      choice match {
        case 1 => StudentService.addStudent()
        case 2 => StudentService.viewStudents()
        case 0 =>
          continue = false
          println("Exiting... Goodbye!")
        case _ => println("Invalid choice. Try again.")
      }
    }
  }
}
