package com.scala.oops

trait PaymentMethod {
  def pay(amount: Double): Unit
}

trait Refundable {
  def refund(amount: Double): Unit
}

trait OnlinePayment extends PaymentMethod {
  def authenticate(): Boolean = {
    println("Authenticating online payment...")
    true
  }
}

class CreditCard extends OnlinePayment with Refundable {
  override def pay(amount: Double): Unit = {
    if (authenticate()) println(s"Paid $amount using Credit Card")
  }

  override def refund(amount: Double): Unit = {
    println(s"Refunded $amount to Credit Card")
  }
}

class Cash extends PaymentMethod {
  override def pay(amount: Double): Unit = {
    println(s"Paid $amount in cash")
  }
}

object Traits {
  def main(args: Array[String]): Unit = {
    val cc = new CreditCard
    cc.pay(150.0)
    cc.refund(50.0)

    val cash = new Cash
    cash.pay(20.0)
  }
}
