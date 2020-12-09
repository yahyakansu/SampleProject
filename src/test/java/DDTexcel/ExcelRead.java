package DDTexcel;

import java.io.File;

public class ExcelRead {
    public static void main(String[] args) {
        File file = new File("src/Sample.xlsx");
        System.out.println(file.exists());
    }
}
