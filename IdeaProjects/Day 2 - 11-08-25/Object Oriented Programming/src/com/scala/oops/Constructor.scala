package com.scala.oops

class Book(val title: String, val author: String, val price: Double = 0.0) {
  def this(title: String, author: String) = this(title, author, 0.0)
  def this(title: String) = this(title, "Unknown", 0.0)
  def this() = this("Untitled", "Unknown", 0.0)

  def display(): Unit = println(s"Title: $title, Author: $author, Price: $$${price}")
}

object Constructor {
  def main(args: Array[String]): Unit = {
    val b1 = new Book("The Alchemist", "Paulo Coelho", 299.99)
    val b2 = new Book("Scala Basics", "John Doe")
    val b3 = new Book("Mystery Novel")
    val b4 = new Book()

    b1.display()
    b2.display()
    b3.display()
    b4.display()
  }
}
