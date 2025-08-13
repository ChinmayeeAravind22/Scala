package com.scala.oops

trait Printer {
  def print(): Unit
}

class TextPrinter extends Printer {
  override def print(): Unit = println("Printing text...")
}

class ImagePrinter extends Printer {
  override def print(): Unit = println("Printing image...")
}

object Polymorphism {
  def main(args: Array[String]): Unit = {
    val printers: List[Printer] = List(new TextPrinter, new ImagePrinter)
    printers.foreach(_.print())
  }
}
