package TestUtility;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.excel.utility.Xls_Reader;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
static Xls_Reader reader;	
	  
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new  ArrayList<Object[]>();
		
		try{
			
			reader = new Xls_Reader("C:\\Users\\dell\\workspace\\FirstJavaProject\\src\\com\\TestParametersInTestNg\\Dataprovider.xlsx");
			
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
		
			for (int rowNum=2; rowNum<= reader.getRowCount("RegTestData");rowNum++){
				
				String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
				String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
				String phone = reader.getCellData("RegTestData", "Phone", rowNum);
				String email = reader.getCellData("RegTestData", "emailaddress", rowNum);
				String address1 = reader.getCellData("RegTestData", "address1", rowNum);
				String address2 = reader.getCellData("RegTestData", "address2", rowNum);
				String city = reader.getCellData("RegTestData", "city", rowNum);
				String state = reader.getCellData("RegTestData", "state", rowNum);
				String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
				String username = reader.getCellData("RegTestData", "username", rowNum);
				String password = reader.getCellData("RegTestData", "password", rowNum);
				String confirmpassword = reader.getCellData("RegTestData", "confirmpassword", rowNum);
				
				Object ob[] = { firstname, lastname, phone, email, address1, address2, city, state, zipcode, username, password, confirmpassword};
				
				myData.add(ob);
	}
	
			return myData;
	}
		
	}
	

