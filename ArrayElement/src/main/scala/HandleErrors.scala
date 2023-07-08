import scala.util.{Try, Success, Failure}
import scala.io.StdIn

object HandleErrors extends App{
  def readInteger: Try[Int] = Try(StdIn.readInt())

  println("Type an integer")

  readInteger match {
    case Success(number) => println(s"You typed $number")
    case Failure(_) => println("That wasn't an integer")
  }
}
