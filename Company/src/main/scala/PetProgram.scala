object PetProgram extends App{

  val cat = new Cat("Garfield")

  cat.sayHello()
  cat.eat()
  cat.sleep()

  trait Pet {
    def sleep(): Unit
    def eat(): Unit
  }

  class Cat(name: String) extends Pet {
    def sayHello(): Unit = {
      println(s"Hello, my name is $name")
    }

    def sleep(): Unit = {
      println("I am sleeping")
    }

    def eat(): Unit = {
      println("I am not hungry anymore")
    }
  }
}
