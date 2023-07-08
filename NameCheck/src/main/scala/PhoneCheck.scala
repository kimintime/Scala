object PhoneCheck extends App{
  def checkNumber(phoneNumber: String): Boolean = {
    val pattern = "\\+[0-9]{3}-[0-9]{2}-[0-9]{5,7}".r

    pattern.matches(phoneNumber)
  }

  val phoneNumbers = Array(
    "+358-40-123324",
    "-358-40-123324",
    "+358-40-123789757",
    "+358-40-12A3324"
  )

  phoneNumbers.foreach { phoneNumber =>
    println(checkNumber(phoneNumber))
  }
}
