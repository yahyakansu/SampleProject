package DDTexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Sample.xlsx");
//        System.out.println(file.exists());

        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int usedRows=sheet.getPhysicalNumberOfRows();
        for (int i=0;i<usedRows;i++){
            int usedCells=sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j=0;j<usedCells;j++){
                System.out.print(sheet.getRow(i).getCell(j)+"\t\t");
            }
            System.out.println();
        }
    }
}
