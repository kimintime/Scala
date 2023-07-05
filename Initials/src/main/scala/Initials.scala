object Initials extends App{
  def printinitials(firstName: String, lastName: String): Unit = {
    print(s"${firstName.capitalize.charAt(0)}.${lastName.capitalize.charAt(0)}.")
  }

  printinitials("John", "Smith")

}
