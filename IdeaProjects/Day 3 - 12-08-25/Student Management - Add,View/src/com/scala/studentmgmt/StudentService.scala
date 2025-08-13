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
    println("\n------ All Students ------")
    for (s <- students) {
      println(s)
    }
  }


}