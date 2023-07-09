import java.io.File
import java.io.PrintWriter

object NumberFile extends App{
  val nums = Array(5, 3, 12, 7, 8, 21, 1, 14, 17)
  val filteredNums = nums.filter(num => num > 10)

  val myFile = new File("nums.txt")
  val myWriter = new PrintWriter(myFile)

  filteredNums.foreach(num => myWriter.println(num.toString))

  myWriter.close()
}
