package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Task {
    public static void main(String[] args) throws IOException {

        altaltaTablo();

    }
    public static void altaltaTablo() throws IOException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows());
                Cell cell0 = newRow.createCell(0);
                cell0.setCellValue((Integer)i);
                Cell cell1 = newRow.createCell(1);
                cell1.setCellValue((String) "x");
                Cell cell2 = newRow.createCell(2);
                cell2.setCellValue((Integer)j);
                Cell cell3 = newRow.createCell(3);
                cell3.setCellValue("=");
                Cell cell4 = newRow.createCell(4);
                cell4.setCellValue((Integer)i*j);
            }
            Row newRow2 = sheet.createRow(sheet.getPhysicalNumberOfRows());
            Cell newCell0 = newRow2.createCell(0);
            newCell0.setCellValue("-----------------------------");
            Cell newCell1 = newRow2.createCell(1);
            newCell1.setCellValue("-----------------------------");
            Cell newCell2 = newRow2.createCell(2);
            newCell2.setCellValue("-----------------------------");
            Cell newCell3 = newRow2.createCell(3);
            newCell3.setCellValue("-----------------------------");
            Cell newCell4 = newRow2.createCell(4);
            newCell4.setCellValue("-----------------------------");
        }
        String path = "src/test/java/ApachePOI/resource/newExcelforTask.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("İşlemler tamamlandı ve excel oluşturuldu");

    }
}
