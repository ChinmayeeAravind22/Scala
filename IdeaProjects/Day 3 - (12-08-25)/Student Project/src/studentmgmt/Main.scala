package studentmgmt

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    var continue = true

    while (continue) {
      println("\n--- Student Management Menu ---\n1. Add Student\n2. View All Students\n3. Update Student\n4. Search Student\n5. Delete Student\n6. Exit")
      println("\nEnter your choice: ")
      val choice = readInt()

      choice match {
        case 1 => StudentService.addStudent()
        case 2 => StudentService.viewStudents()
        case 3 => StudentService.updateStudent()
        case 4 => StudentService.searchStudent()
        case 5 => StudentService.deleteStudent()
        case 6 => continue = false
        case _ => println("Invalid choice. Try again.")
      }
    }
  }
}