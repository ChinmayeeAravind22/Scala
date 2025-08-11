object MethodOverloading {
  class Calculator {
    def add(a: Int, b: Int): Int = a + b
    def add(a: Double, b: Double): Double = a + b
    def add(a: Int, b: Int, c: Int): Int = a + b + c
  }

  def main(args: Array[String]): Unit = {
    val calc = new Calculator
    println(calc.add(5, 10))
    println(calc.add(5.5, 10.5))
    println(calc.add(1, 2, 3))
  }
}
