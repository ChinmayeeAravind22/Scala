object Factorial {
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n = scala.io.StdIn.readInt()
    println(s"Factorial of $n is ${factorial(n)}")
  }
}
