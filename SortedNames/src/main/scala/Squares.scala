object Squares extends App{
  val numbers = Array[Int]( 2, 6, 1, 4, 3, 7)

  val numbersSquared = numbers.map(number => (number * number))
  val total = numbersSquared.sum

  println(s"The sum of squares is $total")

}
