object CardProgram extends App{

  val cards = Array(
    new Card("Heart", 5),
    new Card("Clubs", 2),
    new Card("Spade", 9),
    new Card("Heart", 8),
    new Card ("Spade", 3),
    new Card("Clubs", 4)
  )

  val filteredCards = cards.filter(card => card.suit == "Heart")

  filteredCards.foreach(filteredCard => println(filteredCard.toString))

  class Card(val suit: String, val num: Int) {

    override def toString: String = {
      return s"Card: $num $suit"
    }
  }
}
