object InheritanceExample {
  class Vehicle {
    def start(): String = "Vehicle started"
  }

  class Car extends Vehicle {
    override def start(): String = "Car started"
  }

  def main(args: Array[String]): Unit = {
    val car = new Car
    println(car.start())
  }
}
