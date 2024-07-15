package electricity.billing.system;

import java.sql.*;

public class ConnectionClass {

    Connection c;
    Statement s;
    ConnectionClass() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EBS", "root", "229009");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
