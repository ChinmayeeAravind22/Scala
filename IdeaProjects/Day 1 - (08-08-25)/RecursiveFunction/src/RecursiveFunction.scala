object RecursiveFunction {
  def fibonacci(n: Int): Int = {
    if (n == 0) 0           // base case
    else if (n == 1) 1      // base case
    else fibonacci(n - 1) + fibonacci(n - 2)  // recursive call
  }

  def main(args: Array[String]): Unit = {
    val terms = 10
    println(s"Fibonacci series up to $terms terms:")
    for (i <- 0 until terms) {
      print(fibonacci(i) + " ")
    }
  }
}
