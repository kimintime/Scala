import scala.io.StdIn.readInt

object ArrayElement extends App{
  println("Type an index")

  val index = readInt()

  try {
    val arr = Array(1, 2, 3)

    println(arr(index))
  }

  catch {
    case e: IndexOutOfBoundsException => println("Element doesn't exist")
  }
}
