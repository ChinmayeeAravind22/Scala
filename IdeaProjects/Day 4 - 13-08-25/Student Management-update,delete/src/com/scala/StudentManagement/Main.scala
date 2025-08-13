package com.scala.StudentManagement

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
            |3. Update Student
            |4. Search Student
            |5. Delete Student
            |6. Exit
            |""".stripMargin)

        print("Enter your choice: ")
        val choice = readInt()

        choice match {
          case 1 => StudentService.addStudent()
          case 2 => StudentService.viewStudents()
          case 3 => StudentService.updateStudent()
          case 4 => StudentService.searchStudent()
          case 5 => StudentService.deleteStudent()
          case 6 =>
            continue = false
            println("Exiting... Goodbye!")
          case _ => println("Invalid choice. Try again.")
        }
      }
    }
  }


