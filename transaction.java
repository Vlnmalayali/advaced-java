import java.sql.*;
import java.io.*;

class transaction {
    public static void main(String args[]) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MY_DB", "root", "Vishnulal@2003");
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("INSERT INTO transactions (id, name, salary) VALUES (?, ?, ?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.println("Enter ID:");
                String s1 = br.readLine();
                int id = Integer.parseInt(s1);

                System.out.println("Enter Name:");
                String name = br.readLine();

                System.out.println("Enter Salary:");
                String s3 = br.readLine();
                int salary = Integer.parseInt(s3);

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, salary);
                ps.executeUpdate();

                System.out.println("Commit/Rollback:");
                String answer = br.readLine();
                if (answer.equalsIgnoreCase("commit")) {
                    con.commit();
                }
                if (answer.equalsIgnoreCase("rollback")) {
                    con.rollback();
                }

                System.out.println("Want to add more records (y/n)?");
                String ans = br.readLine();
                if (ans.equalsIgnoreCase("n")) {
                    break;
                }
            }
            con.commit();
            System.out.println("Record successfully saved");

            con.close(); // Before closing connection commit() is called
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
