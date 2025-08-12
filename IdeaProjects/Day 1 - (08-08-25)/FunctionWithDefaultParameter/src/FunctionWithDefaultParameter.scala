object FunctionWithDefaultParameter
{
  def greet(name: String = "Guest"): Unit = {
    println(s"Hello, $name!")
  }

  def main(args: Array[String]): Unit = {
    greet()           // Using default parameter
    greet("Alice")    // Passing a custom parameter
  }
}
