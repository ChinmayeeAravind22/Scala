object PersonStudentExample {

  trait PrintInfo {
    def printInfo(): Unit
  }

  class Person(private var name: String, private var age: Int) extends PrintInfo {

    def getName: String = name
    def setName(newName: String): Unit = name = newName

    def getAge: Int = age
    def setAge(newAge: Int): Unit = age = newAge

    def greet(): String = s"Hello, I'm $name."
    def greet(greeting: String): String = s"$greeting, I'm $name."

    override def printInfo(): Unit = {
      println(s"[Person]")
      println(s"Name  : $name")
      println(s"Age   : $age")
    }
  }

  class Student(
                 name: String,
                 age: Int,
                 private var studentId: String,
                 private var course: String
               ) extends Person(name, age) {

    def getStudentId: String = studentId
    def setStudentId(id: String): Unit = studentId = id

    def getCourse: String = course
    def setCourse(newCourse: String): Unit = course = newCourse

    override def printInfo(): Unit = {
      println(s"[Student]")
      println(s"Name       : ${getName}")
      println(s"Age        : ${getAge}")
      println(s"Student ID : $studentId")
      println(s"Course     : $course")
    }
  }

  def main(args: Array[String]): Unit = {
    val person = new Person("Shilpa", 40)
    val student = new Student("Chinmayee Aravinds", 21, "S1234", "Computer Science")

    println("=== Person Info ===")
    person.printInfo()
    println(person.greet())
    println(person.greet("Good morning"))

    println("\n=== Student Info ===")
    student.printInfo()
    println(student.greet())
  }
}
