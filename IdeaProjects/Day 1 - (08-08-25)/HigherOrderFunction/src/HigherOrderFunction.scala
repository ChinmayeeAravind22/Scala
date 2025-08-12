object HigherOrderFunction {
def applyFunction(f:(Int,Int)=>Int,a:Int,b:Int):Int={
  f(a,b)
}
def main(args:Array[String]):Unit={
  val add = (a:Int,b:Int)=>a+b
  val sum =applyFunction(add,5,3)
  println(s"Sum is $sum")
}
}
