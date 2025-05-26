package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_ApachePOINewExcel {

    public static void main(String[] args) throws IOException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sekme1");

        Row newRow = sheet.createRow(0);
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("Sıfırdan oluşturduğum excel dosyası");

        String path = "src/test/java/ApachePOI/resource/CreatedExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Dosya oluşturuldu");

    }
}
