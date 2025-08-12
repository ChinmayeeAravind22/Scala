object WhileLoop {
  def main(args: Array[String]): Unit = {
    var i = 1
    while (i <= 5) {
      println(s"i = $i")
      i += 1
    }
  }
}
