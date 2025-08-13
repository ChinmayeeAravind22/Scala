package com.scala.oops

trait PrintInfo {
  def printInfo(): Unit
}

class Person(val name: String, val age: Int) extends PrintInfo {
  override def printInfo(): Unit = {
    println("[Person]")
    println(s"Name : $name")
    println(s"Age  : $age")
  }
}

class Student(name: String, age: Int, val studentId: String, val course: String)
  extends Person(name, age) {

  override def printInfo(): Unit = {
    println("[Student]")
    println(s"Name       : $name")
    println(s"Age        : $age")
    println(s"Student ID : $studentId")
    println(s"Course     : $course")
  }
}

object PersonStudent {
  def main(args: Array[String]): Unit = {
    val person = new Person("Shilpa", 35)
    val student = new Student("Chinmayee Aravind", 20, "S2025", "Mathematics")

    println("=== Person Info ===")
    person.printInfo()

    println("\n=== Student Info ===")
    student.printInfo()
  }
}
