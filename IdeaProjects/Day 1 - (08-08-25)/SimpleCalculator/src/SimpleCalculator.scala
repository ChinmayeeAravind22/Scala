import scala.io.StdIn._
object SimpleCalculator {
def main(args: Array[String]):Unit={
  println("Enter first number : ")
  val num1: Int=readInt()
  println("Enter second number : ")
  val num2: Int = readInt()
  println("Enter the operator ")
  val op: String = readLine()
  val result=op match {
    case "+" => num1+num2
    case "-" => num1-num2
    case "*" => num1*num2
    case "/" => if(num2!=0)num1/num2
                else{
                  println("Error: Division by Zero not possible ")
                  return
                }
    case "%" => num1%num2
    case _ =>   println("Invalid Operator")
                return
  }
  println(s"Result of $num1 $op $num2 is : $result")

}
}
