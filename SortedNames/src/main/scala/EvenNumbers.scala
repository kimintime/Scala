object EvenNumbers extends App{
  val numbers = Array(1, 4, 6, 13, 16, 17, 22, 31, 33, 37)

  val evenNumbers = numbers.filter(x => (x % 2 == 0))

  val oddNumbers = numbers.filter(x => (x % 2 != 0))

  println(s"The amount of even numbers is ${evenNumbers.length}")
  println(s"The amount of odd numbers is ${oddNumbers.length}")

}
