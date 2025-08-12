object PolymorphismExample {
  class Vehicle {
    def move(): String = "Vehicle is moving"
  }

  class Car extends Vehicle {
    override def move(): String = "Car is moving"
  }

  class Bicycle extends Vehicle {
    override def move(): String = "Bicycle is moving"
  }

  def main(args: Array[String]): Unit = {
    val vehicles: List[Vehicle] = List(new Car, new Bicycle)
    vehicles.foreach(vehicle => println(vehicle.move()))
  }
}
