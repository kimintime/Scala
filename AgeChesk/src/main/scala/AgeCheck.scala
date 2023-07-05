import scala.io.StdIn.readInt

object AgeCheck extends App {
  println("What is your age?")

  val age: Int = readInt()

  if (age > 18) {
    println("Welcome")

  } else {
    println("You are too young")
  }

}
