object Company extends App{

  val employee = new Employee("Lisa Smith")
  val manager = new Manager("Mary Poppins", "12345")

  employee.paySalary(2000)
  println(employee.toString)

  manager.payBonus(500)
  println(manager.toString)

  class Employee(name: String) {
    def paySalary(amount: Int): Unit = {
      println(s"Salary paid: $amount")
    }

    override def toString: String = {
      s"Hello $name"
    }
  }

  class Manager(name: String, var managerId: String) extends Employee(name) {
    def payBonus(amount: Int): Unit = {
      println(s"Bonus paid: $amount")
    }

    override def toString: String = {
      s"Manager $managerId"
    }
  }
}
