object NestedLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      for (j <- 1 to 5) {
        print(f"${i * j}%3d ")
      }
      println()
    }
  }
}
