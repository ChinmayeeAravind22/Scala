class Smartphone
{

  var number: Int = 16
  var nameofcompany: String = "Apple"

  def Display():Unit=
  {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }
}
object Main {

  def main(args: Array[String]): Unit = {

    var obj = new Smartphone();
    obj.Display();
  }
}


