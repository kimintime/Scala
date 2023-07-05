import scala.io.StdIn.readLine

object Compass extends App{
  val directions = Map("N" -> "North", "W" -> "West", "S" -> "South", "E" -> "East")

  println("Where are you going (N/W/S/E)?")
  val entered = readLine()

  println(s"You are going ${directions(entered)}")

}
