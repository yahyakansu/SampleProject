package utilities;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBUtils {
    private static String URL = "jdbc:mysql://localhost:3306/hr?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String DBUserName = "root";
    private static String DBPassword = "root";

    private static String oraURL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String oraDBUserName = "hr";
    private static String oraDBPassword = "hr";

    static Connection connection=null;
    static Statement statement=null;
    static Resultset resultSet=null;

    public enum DbType{
        MySQl,Oracle
    }

    public static Connection getConnection(DbType dbType){
        try {
            switch (dbType){
                case MySQl:
                    return DriverManager.getConnection(URL,DBUserName,DBPassword);
                case Oracle:
                    return DriverManager.getConnection(oraURL, oraDBUserName, oraDBPassword);
                default:
                    throw new RuntimeException("Invalid database passed");
            }
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(){
        try {
            if (statement!=null)statement.close();
            if (connection!=null)connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public static List<String>
}
