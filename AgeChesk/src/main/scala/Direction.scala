object Direction extends App {
  def direction(whichDirection: Int) : String = whichDirection match {
    case 0 => "North"
    case 1 => "West"
    case 2 => "South"
    case 3 => "East"
    case n if n < 0 || n > 3 => "Invalid Direction"
  }

  println(direction(2))
  println(direction(0))
  println(direction(7))

}
