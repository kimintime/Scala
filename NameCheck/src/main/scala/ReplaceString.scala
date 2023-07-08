object ReplaceString extends App{

  val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
  val pattern = "or".r

  val updatedLorem = pattern.replaceAllIn(loremIpsum, "OR")

  println(updatedLorem)

}
