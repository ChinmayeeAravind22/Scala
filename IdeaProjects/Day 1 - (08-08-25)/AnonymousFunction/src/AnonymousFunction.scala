object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => a + b  // Lambda expression
    val result = add(5, 3)
    println(s"The sum is: $result")
  }
}
