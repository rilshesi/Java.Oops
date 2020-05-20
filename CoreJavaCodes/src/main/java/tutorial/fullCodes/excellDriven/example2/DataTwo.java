package tutorial.fullCodes.excellDriven.example2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataTwo {
    Row row;
    Cell cell;
    public void getCellValue() throws IOException {

        String path = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\resourses\\dataDrivenExcel.xlsx";
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+path);

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");


         /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */

        /*1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }*/

        // 2. Or you can use a for-each loop
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook) {
            //System.out.println("=> " + sheet.getSheetName());
            if(sheet.getSheetName().equalsIgnoreCase("testdata")){
                Iterator<Row> rowIterator  = sheet.rowIterator();

                while (rowIterator.hasNext()){
                    row = rowIterator.next();
                    //System.out.println(row.getRowNum());

                    // Now let's iterate over the columns of the current row
                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()){
                        cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
                        System.out.print(cellValue + "\t");
                    }
                    System.out.println();
                }

            }
        }


    }

}
