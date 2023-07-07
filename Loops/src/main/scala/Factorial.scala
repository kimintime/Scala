import scala.io.StdIn.readInt

object Factorial extends App{
  println("Type the integer:")

  val number: Int = readInt()
  var factorial = 1

  for(i <- 1 to number ) {
    factorial *= i
  }

  println(s"The factorial of $number is $factorial")

}
