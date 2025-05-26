package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_ApachePOIWriteInExcel {

    public static void main(String[] args) throws IOException, IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile (1).xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows());
        Row newRow = sheet.createRow(2);

        //Cell newCell = newRow.createCell(0);
        Cell newCell = newRow.createCell(newRow.getPhysicalNumberOfCells());

        newCell.setCellValue("Test amaçlı oluşturulmuş hücredir");
        //newCell.setCellValue("Yerine yazmak istedim");

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Yazma Tamamlandı");
    }

}
