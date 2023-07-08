object Name extends App{
  def printName(name: Option[String]): Unit = {
    name match {
      case Some(n) => println(s"Hello $n")
      case None => println("No name")
    }
  }

  printName(Some("John"))
  printName(None)
}
