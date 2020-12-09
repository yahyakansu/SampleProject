package DDT_excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream("src/Sample.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        sheet.createRow(0).createCell(0);

        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);

        cell.setCellValue("Hello World");

        FileOutputStream outputStream = new FileOutputStream("src/Sample.xlsx");
        workbook.write(outputStream);

        inputStream.close();
        outputStream.close();
        workbook.close();
    }
}
