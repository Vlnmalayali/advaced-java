import java.sql.*;

public class JDBCExample {
    // JDBC URL, username, and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/my_db";
    static final String USER = "root";
    static final String PASS = "Vishnulal@2003";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(JDBC_URL, USER, PASS);

            // Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT id, name, salary FROM employees";
            rs = stmt.executeQuery(sql);

            // Iterate through the result set and print the data
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Salary: " + salary);
            }
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
