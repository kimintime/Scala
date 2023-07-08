import java.sql.{Connection, DriverManager, ResultSet, SQLException}

object EmployeeDatabase extends App{
  var conn: Connection = _

  try {
    Class.forName("org.h2.Driver")
    conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")

    println("Connection created")

    val stmt = conn.createStatement()

    //Create table
    var sql = "CREATE TABLE IF NOT EXISTS employee " +
      "(id INTEGER not NULL, " +
      " name VARCHAR(255), " +
      " department VARCHAR(255), " +
      " salary INTEGER, " +
      " PRIMARY KEY ( id ))"

    stmt.executeUpdate(sql)

    //Insert Data
    sql = "INSERT INTO employee VALUES " +
      "(1, 'Lisa Smith', 'IT', 3200), " +
      "(2, 'John Johnson', 'HR', 2600), " +
      "(3, 'Mary Poppins', 'IT', 2900), " +
      "(4, 'Pete Best', 'HR', 4200)"

    stmt.executeUpdate(sql)

    //Query
    sql = "SELECT name, department FROM employee WHERE salary > 3000"
    val res: ResultSet = stmt.executeQuery(sql)

    while (res.next) {
      println(s"${res.getString("name")}, ${res.getString("department")}")
    }

    //Close
    res.close
    stmt.close
    conn.close

  }

  catch {
    case e: ClassNotFoundException => println("Driver class not found")
    case e: SQLException => println(s"Connection failed: ${e.getMessage}")
  }

}
