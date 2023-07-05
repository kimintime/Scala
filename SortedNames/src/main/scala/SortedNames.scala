import scala.io.StdIn.readLine

object SortedNames extends App{
  val names = new Array[String](3)

  for (i <- 0 until names.length) {
    println("Enter name")
    names(i) = readLine()
  }

  val sortedNames = names.sorted

  println(s"The first in alphabetical order is: ${sortedNames(0)}")

}
