object EncapsulationExample {
  class Employee(private var salary: Double) {
    def setSalary(amount: Double): Unit = {
      if (amount > 0) salary = amount
    }

    def getSalary(): Double = salary
  }

  def main(args: Array[String]): Unit = {
    val employee = new Employee(5000)
    employee.setSalary(6000)
    println(employee.getSalary())
  }
}
