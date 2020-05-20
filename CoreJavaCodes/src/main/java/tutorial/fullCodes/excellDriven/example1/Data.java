package tutorial.fullCodes.excellDriven.example1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Data {



   public ArrayList getData(String testCaseName) throws IOException {
       ArrayList<String> a = new ArrayList<String>();

        String path = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\resourses\\dataDrivenExcel.xlsx";
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        int sheets = workbook.getNumberOfSheets();


        for(int i = 0; i<sheets; i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("testdata")){
                XSSFSheet sheet = workbook.getSheetAt(i);   // has sheet test data
                Iterator<Row> rowsIterator = sheet.iterator(); // has entire row
                Row nextRow  = rowsIterator.next();            //move to ist row at i=0
                Iterator<Cell> cells = nextRow .cellIterator();   //for each row Iterate thru all the column
               //System.out.println(cells.next().getStringCellValue());    //has the fist cell value in ist row


                int rowIndex = 0;
                int columnIndex = 0;
                while(cells.hasNext()) { // to right of testData
                    Cell rowCells = cells.next();  //loop to get all cell in row 0
                    System.out.println(rowCells.getStringCellValue());          // print all cell in row 0 ->

                    if(rowCells.getStringCellValue().equalsIgnoreCase("Data1")){
                        columnIndex = rowIndex;
                    }
                    columnIndex++;

                }
                System.out.println(columnIndex);



                //scanning entire column cells in columnIndex
                while(rowsIterator.hasNext()) {
                    Row row = rowsIterator.next();
                    if(row.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(testCaseName)){
                        // After you grab Login row, pull the data of that row and feed into test case
                        Iterator<Cell> LoginCell = row.cellIterator(); //check all cells in Login row

                        while (LoginCell.hasNext()){
                            //add cell to arraylist
                            a.add(LoginCell.next().getStringCellValue());

                            Cell c = LoginCell.next();
                            if(c.getCellType()== CellType.STRING)
                            {
                                a.add(c.getStringCellValue());
                            }
                            else
                            {
                                // Here we need to convert the numeric to string as arrayList only accept string
                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }


                        }

                    }

                }
            }

        }
       
       return a;

    }


}
