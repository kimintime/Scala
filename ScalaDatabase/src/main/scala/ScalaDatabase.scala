import java.sql.{Connection, DriverManager, ResultSet, SQLException}

object ScalaDatabase extends App{
  var conn: Connection = _

  try {
    Class.forName("org.h2.Driver")
    conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")

    println("Connection created")

    val stmt = conn.createStatement()

    //Create table
    var sql = "CREATE TABLE IF NOT EXISTS student " +
      "(id INTEGER not NULL, " +
      " name VARCHAR(255), " +
      " email VARCHAR(255), " +
      " PRIMARY KEY ( id ))"

    stmt.executeUpdate(sql)

    //Insert data
    sql = "INSERT INTO student VALUES " +
      "(1, 'Lisa Smith', 'lisa@mail.com'), " +
      "(2, 'John Johnson', 'john@mail.com'), " +
      "(3, 'Mary Poppins', 'mary@mail.com')"

    stmt.executeUpdate(sql)

    // Fetch data
    sql = "SELECT id, name, email FROM student"
    val res: ResultSet = stmt.executeQuery(sql)

    while (res.next) {
      println(s"${res.getString("name")}, ${res.getString("email")}")
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
