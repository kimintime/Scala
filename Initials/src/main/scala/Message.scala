object Message extends App {
  def msgFunc(f: String => String, message: String): String = f(message)

  val helloMsg = (name: String) => s"Hello ${name}"
  val goodbyeMsg = (name: String) => s"Goodbye ${name}"

  println(msgFunc(helloMsg, "Lisa"))
  println(msgFunc(goodbyeMsg, "Lisa"))

}