import scala.io.StdIn.readLine

object NameCheck extends App{

  val validName = "[A-Z][a-z]+".r

  println("Enter your firstname")

  val firstName = readLine()

  if (validName.matches(firstName)) {
    println(s"Hello $firstName")

  } else {
    println("Name is invalid")
  }
}
