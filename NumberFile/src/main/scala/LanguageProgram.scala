import java.io.{File, FileNotFoundException, PrintWriter}
import scala.io.Source

object LanguageProgram extends App{
  val languages = Array("Java", "Perl", "Python", "Scala", "C#")

  val myFile = new File("languages.txt")
  val myWriter = new PrintWriter(myFile)

  languages.foreach(language => myWriter.println(language))

  myWriter.close()

  try {
    val readFile = Source.fromFile("languages.txt")

    while (readFile.hasNext) {
      print(readFile.next)
    }
  }

  catch {
    case e: FileNotFoundException => println("File not found")
  }
}
