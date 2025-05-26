package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_ApachePOIData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";

        FileInputStream filePath = new FileInputStream(path);

        // workbook -> sheet -> Row -> cell

        Workbook dosya = WorkbookFactory.create(filePath);
        Sheet sekme = dosya.getSheet("Sheet1");

        Row row = sekme.getRow(0);

        Cell cell = row.getCell(0);

        System.out.println(cell);
    }
}
