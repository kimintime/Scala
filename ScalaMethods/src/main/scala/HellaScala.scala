object HelloScala extends App {
  def printChar(s: String, i: Int): Unit = {
    println(s"The character is: ${s.charAt(i)}")
  }

  printChar("How this works", 5)
}
