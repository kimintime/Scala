/** This is example documentation Isn't it just awesome
  */

import scala.io.StdIn.readLine

object HelloScala extends App {
//   println("Hello Scala")

//   println({
//     val x = 10
//     x + 5
//   })

print("What is your name? ")

val name = readLine()

println(s"Hello $name")

}
