trait Printable extends Any {
  def print(): Unit = println(this)
}

trait Movable {
  def move(dx: Int, dy: Int): Unit
}

trait Equals {
  def isEqual(obj: Any): Boolean
  def isNotEqual(obj: Any): Boolean = !isEqual(obj)
}

class Points(xc: Int, yc: Int) extends Equals with Printable with Movable {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Points]
    && obj.asInstanceOf[Points].x == x && obj.asInstanceOf[Points].y == y

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
  }

  override def print(): Unit = println(s"Points($x, $y)")
}

object Example {
  def main(args: Array[String]): Unit = {
    val p1 = new Points(2, 3)
    val p2 = new Points(2, 4)
    val p3 = new Points(2, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

    p1.print()
    p1.move(1, 1)
    p1.print()
  }
}