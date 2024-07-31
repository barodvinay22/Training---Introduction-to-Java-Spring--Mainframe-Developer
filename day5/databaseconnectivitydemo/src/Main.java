import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/my_db_name","root","root");
        Statement stmt=con.createStatement();
        //stmt.execute("Create table test(id integer)");
        stmt.execute("insert into test values(1)");
        con.close();
    }
}