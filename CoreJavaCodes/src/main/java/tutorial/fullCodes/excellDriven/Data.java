package tutorial.fullCodes.excellDriven;

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


                Iterator<Row> rows = sheet.iterator(); // has entire row
                Row firstRow = rows.next();            //move to ist row

                Iterator<Cell> cells = firstRow.cellIterator();   //has all cells is first row
               // System.out.println(cells.next().getStringCellValue());    //has the fist cell value


                int rowIndex = 0;
                int columnIndex = 0;
                while(cells.hasNext()) {
                    Cell rowCells = cells.next();  //loop to get all cell in row 0
                    System.out.println(rowCells.getStringCellValue());

                    if(rowCells.getStringCellValue().equalsIgnoreCase("Testcases")){
                        columnIndex=rowIndex;
                    }
                    rowIndex++;
                }
                System.out.println(columnIndex);



                //scanning entire column cells in rowIndex
                while(rows.hasNext()) {
                    Row row = rows.next();
                    if(row.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(testCaseName)){
                        // After you grab Login row, pull the data of that row and feed into test case
                        Iterator<Cell> LoginCell = row.cellIterator(); //check all cells in Login row
                        while (LoginCell.hasNext()){
                           // System.out.println(LoginCell.next().getStringCellValue());
                            //add cell to arraylist
                            a.add(LoginCell.next().getStringCellValue());

                            Cell c = LoginCell.next();
                            if(c.getCellType()== CellType.STRING)
                            {
                                a.add(c.getStringCellValue());
                            }
                            else
                            {

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
