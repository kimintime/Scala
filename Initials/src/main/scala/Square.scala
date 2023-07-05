import scala.io.StdIn.readInt

object Square extends App {
  val square = (numSquare: Int) => numSquare * numSquare

  println("Type an integer")

  val number = readInt()

  println(s"Square = ${square(number)}")

}
