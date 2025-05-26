package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.Scanner;

public class _04_ApachePOIGetData {
    public static void main(String[] args) {
        System.out.println("Lütfen Bir Arama Kelimesi Giriniz: ");

        Scanner sc = new Scanner(System.in);
        String aranacak = sc.next();

        String sonuc = sonucuGetir(aranacak);
        System.out.println(sonuc);


    }
    public static String sonucuGetir (String text){
        String sonuc = "";

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Sheet sheet = null;

        try{
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        }catch (Exception e){

        }
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(text)){
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    sonuc += sheet.getRow(i).getCell(j) + " ";
                }
            }

        }

        return sonuc;
    }
}
