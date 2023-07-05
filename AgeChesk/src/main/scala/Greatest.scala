import scala.io.StdIn.readInt

object Greatest extends App {
  println("Enter integer 1")
  val x: Int = readInt()

  println("Enter integer 2")
  val y: Int = readInt()

  println("Enter integer 3")
  val z: Int = readInt()

  if (x > y && x > z) {
    println(s"Greatest = $x")

  } else if (y > x && y > z) {
    println(s"Greatest = $y")

  } else {
    println(s"Greatest = $z ")
  }
}
