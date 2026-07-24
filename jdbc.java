import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                                 "id INT PRIMARY KEY, " +
                                 "name VARCHAR(50))";

            stmt.executeUpdate(createTable);
            System.out.println("Table Created");

            // Insert Data
            stmt.executeUpdate("INSERT INTO student VALUES (1,'John')");
            stmt.executeUpdate("INSERT INTO student VALUES (2,'Alice')");

            System.out.println("Data Inserted");

            // Read Data
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
