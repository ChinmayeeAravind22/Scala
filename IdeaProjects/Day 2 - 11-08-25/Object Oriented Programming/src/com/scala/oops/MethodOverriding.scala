package com.scala.oops

class Vehicle {
  def start(): Unit = println("Vehicle starting")
}

class Car extends Vehicle {
  override def start(): Unit = println("Car starting with ignition key")
}

object MethodOverriding {
  def main(args: Array[String]): Unit = {
    val vehicle = new Vehicle
    vehicle.start()

    val car = new Car
    car.start()
  }
}
