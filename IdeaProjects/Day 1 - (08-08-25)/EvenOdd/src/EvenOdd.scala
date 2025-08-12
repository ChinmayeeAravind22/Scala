object EvenOdd {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val num = scala.io.StdIn.readInt()
    if (num % 2 == 0)
      println(s"$num is Even")
    else
      println(s"$num is Odd")
  }
}
