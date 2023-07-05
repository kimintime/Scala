import scala.io.StdIn.readLine

object Initials extends App {
  println("Type your firstname")

  val first = readLine()

  println("Type your lastname")

  val last = readLine()

  println(s"Your initials: ${first.capitalize.charAt(0)}.${last.capitalize.charAt(0)}.")
}
