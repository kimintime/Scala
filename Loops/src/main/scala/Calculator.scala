object Calculator extends App{
  var sum = 0

  for(i <- 1 to 20) {
    sum += i
  }

  println(s"Sum = $sum")
}
