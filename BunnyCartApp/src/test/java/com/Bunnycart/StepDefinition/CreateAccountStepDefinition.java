package com.Bunnycart.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Pages.CreateAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition {

	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
		Browser.init("CreateAccountPage_Report"); 
		Browser.openBrowser("chrome");
	}

	@Given("User navigates to {string} webpage")
	public void user_navigates_to_webpage(String string) throws Exception {
		Browser.navigateToUrl(string);
	}

	@Given("User clicks on create an account button")
	public void user_clicks_on_create_an_account_button() {
		CreateAccountPage.clickCreatAccount();
	}

	@When("User enters details using Excel file and clicks on create account button")
	public void user_enters_details_using_excel_file_and_clicks_on_create_account_button(DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials(
				"C:\\Users\\badis\\eclipse-workspace\\BunnyCartApp\\src\\main\\resources\\testData\\RigisterData.xlsx");
		dataTable = DataTable.create(credentials);

		for (int i = 1; i < credentials.size(); i++) {

            
            if(i==1) {
            	
            	 CreateAccountPage.enterFirstName(credentials.get(i).get(0));
                 CreateAccountPage.enterLastName(credentials.get(i).get(1));
                 CreateAccountPage.enterEmail(credentials.get(i).get(2));
                
                 CreateAccountPage.enterWhatsAppNumber(credentials.get(i).get(4));
                 
                 CreateAccountPage.clickCreatAccountButton();
               CreateAccountPage.failedmessage();
            }
            else {
            	 CreateAccountPage.enterPassword(credentials.get(i).get(3));
                 CreateAccountPage.enterConfirmPassword(credentials.get(i).get(3));
                 CreateAccountPage.clickCreatAccountButton();
                 
            	CreateAccountPage.successmessage();
            }
        }
	}
	
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
	    List<List<String>> credentials = new ArrayList<>();
	    FileInputStream file = new FileInputStream(new File(excelFilePath));
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    Sheet sheet = workbook.getSheetAt(0);

	    for (int i = 0; i <= sheet.getLastRowNum(); i++) {
	        Row row = sheet.getRow(i);
	        List<String> rowData = new ArrayList<>();
	        if (row != null) {
	            for (int j = 0; j < row.getLastCellNum(); j++) {
	                Cell cell = row.getCell(j);
	                if (cell != null) {
	                    // Check cell type before reading
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            rowData.add(cell.getStringCellValue());
	                            break;
	                        case NUMERIC:
	                            rowData.add(String.valueOf((int) cell.getNumericCellValue())); // Convert to String
	                            break;
	                        case BOOLEAN:
	                            rowData.add(String.valueOf(cell.getBooleanCellValue()));
	                            break;
	                        default:
	                            rowData.add(""); // Handle other types (BLANK, FORMULA, etc.)
	                            break;
	                    }
	                } else {
	                    rowData.add(""); // Add empty value for null cells
	                }
	            }
	        }
	        credentials.add(rowData);
	    }

	    workbook.close();
	    file.close();
	    return credentials;
	}

	@Then("User verifies the message")
	public void user_verifies_the_message() throws Exception {		
		// Message verified in previous step.
		Thread.sleep(1000);
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		Browser.closeBrowser();
	}
}
