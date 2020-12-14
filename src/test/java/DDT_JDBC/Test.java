package DDT_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    private static String URL = "jdbc:mysql://localhost:3306/hr?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String DBUserName = "root";
    private static String DBPassword = "root";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL,DBUserName,DBPassword);
            System.out.println("MySQL database connection is successful");
            if (connection!=null){
                connection.close();
            }
        }catch (Exception e){
            System.err.println("Connection is NOT successful");
            e.printStackTrace();
        }
    }
}
