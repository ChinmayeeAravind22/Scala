package com.scala.oops

class Encapsulation {
  private var balance: Double = 0.0

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$amount. New balance: $$balance")
    } else {
      println("Invalid deposit amount.")
    }
  }

  def getBalance: Double = balance
}

object Encapsulation {
  def main(args: Array[String]): Unit = {
    val acc = new Encapsulation
    acc.deposit(200.0)
    println(s"Balance: $${acc.getBalance}")
  }
}
