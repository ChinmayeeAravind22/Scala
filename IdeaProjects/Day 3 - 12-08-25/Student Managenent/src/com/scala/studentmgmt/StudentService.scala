package com.scala.studentmgmt

import scala.collection.mutable.ListBuffer
import scala.io.StdIn._


object StudentService {
  private val students = ListBuffer[Student]()

  def addStudent(): Unit = {
    var id: Int = 0
    var valid = false

    while (!valid) {
      print("Enter ID: "); id = readInt()
      if (students.exists(_.id == id)) {
        println(s"ID $id is already in use. Try a different one.")
      } else {
        valid = true
      }
    }

    print("Enter Name: "); val name = readLine()
    print("Enter Age: "); val age = readInt()
    print("Enter Grade: "); val grade = readLine()
    students += Student(id, name, age, grade)
    println("Student added successfully.")
  }


  def viewStudents(): Unit = {
    println("\n--- All Students ---")
    for (s <- students) {
      println(s)
    }
  }

  def updateStudent(): Unit = {
    print("Enter ID to update: "); val id = readInt()
    val index = students.indexWhere(s => s.id == id)
    if (index != -1) {
      print("Enter New Name: "); val name = readLine()
      print("Enter New Age: "); val age = readInt()
      print("Enter New Grade: "); val grade = readLine()
      students(index) = Student(id, name, age, grade)
      println("Student updated successfully.")
    } else {
      println("Student not found.")
    }
  }

  def searchStudent(): Unit = {
    print("Enter ID to search: "); val id = readInt()
    val index = students.indexWhere(s => s.id == id)
    if (index != -1) {
      println("Found: " + students(index))
    } else {
      println("Student not found.")
    }
  }

  def deleteStudent(): Unit = {
    print("Enter ID to delete: "); val id = readInt()
    val index = students.indexWhere(s => s.id == id)
    if (index != -1) {
      students.remove(index)
      println("Student deleted successfully.")
    } else {
      println("Student not found.")
    }
  }
}