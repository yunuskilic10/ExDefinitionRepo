package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIAllData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx";

        FileInputStream filePath = new FileInputStream(path);

        // workbook -> sheet -> Row -> cell

        Workbook dosya = WorkbookFactory.create(filePath);
        Sheet sheet = dosya.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows(); // cars.length

        for (int i = 0; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells(); // cars[i].length

            for (int j = 0; j < cellCount; j++) {

                Cell cell = row.getCell(j);
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
        System.out.println("*********************************");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"\t");
            }
            System.out.println();
        }
    }
}


