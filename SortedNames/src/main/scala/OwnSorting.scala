object OwnSorting extends App{
  val names = List("Elisabeth", "Mike", "Lisa", "Annie", "John", "Layla")

  val sortedNames = names.sortBy(name => name.charAt(1))

  println(sortedNames)

}
