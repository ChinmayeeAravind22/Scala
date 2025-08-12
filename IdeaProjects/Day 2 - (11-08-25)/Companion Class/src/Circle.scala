class Circle(val radius: Double) {
  def area: Double = Circle.Pi * radius * radius
}

object Circle {
  val Pi: Double = 3.14159

  def apply(radius: Double): Circle = new Circle(radius)
}

object Demo {
  def main(args: Array[String]) = {
    val circle = Circle(5.0)
    println(s"Circle radius: ${circle.radius}")
    println(s"Circle area: ${circle.area}")
  }
}