import scala.util.matching.Regex

object FindWords extends App{
  val str = "Dolor aute irure dolor in reprehenderit in voluptate esse cillum dolor eu fugiat nulla pariatur."

  val pattern = new Regex("[Dd]olor")

  val matches = pattern.findAllIn(str)
  val count = matches.size

  println(s"There are $count Dolor or dolor words")
}
