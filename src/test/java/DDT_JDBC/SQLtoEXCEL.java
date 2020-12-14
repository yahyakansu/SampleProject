package DDT_JDBC;

import org.testng.annotations.Test;
import utilities.DBUtils;
import utilities.ExcelUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SQLtoEXCEL {

    @Test
    public void test() throws SQLException {
        Connection connection=DBUtils.getConnection(DBUtils.DbType.MySQl);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select country_id, country_name from countries");

        ExcelUtils.openExcelFile("src/Sample.xlsx","Sheet4");

        //write column names into the excel
        ExcelUtils.setCellValue(0,0,"COUNTY_ID");
        ExcelUtils.setCellValue(0,1,"COUNTY_NAME");

        //write data from sql into excel
        int currentRow = 1;
        while(resultSet.next()) {
            String countryId = resultSet.getString("country_id");
            String countryName = resultSet.getString("country_name");

            ExcelUtils.setCellValue(currentRow, 0, countryId);
            ExcelUtils.setCellValue(currentRow, 1, countryName);
            currentRow++;
        }

        DBUtils.closeConnection();
    }
}
