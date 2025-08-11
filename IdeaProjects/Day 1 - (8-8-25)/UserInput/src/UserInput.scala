object UserInput {
  def main(args: Array[String]): Unit = {
    print("Enter your name: ")
    val name = scala.io.StdIn.readLine()
    println(s"Hello, $name!")
  }
}