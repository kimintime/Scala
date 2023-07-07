object Filter extends App{
  val numbers = Array(2, 6, 1, 9, 3, 12, 21, 5, 16)

  val newNumbers = for {
    number <- numbers
    if number > 6
  } yield number

  for(newNumber <- newNumbers) {
    println(newNumber)
  }
}
