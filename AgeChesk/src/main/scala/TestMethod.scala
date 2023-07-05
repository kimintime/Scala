object TestMethod extends App {
  def isValidString(isValid: String) : Boolean = {
    if (isValid.length >= 5 && isValid.length <= 10) {
      return true
    } else {
      return false
    }
  }

  println(isValidString("Test"))
  println(isValidString("SecondTest"))

}
