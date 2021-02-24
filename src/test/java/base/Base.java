package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void sendKey(WebElement element, String data ) {
		element.sendKeys(data);
	}
	
	
	public void click(WebElement element) {
		element.click();
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public String getAttribut(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	
	
	//excel read
	public String excelRead(String loc, String sheetName, int rowNumber, int cellNumber) throws Exception {
		FileInputStream stream=new FileInputStream(new File(loc));
		Workbook wb=new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		int cellType = cell.getCellType();
		
		if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
				String text = s.format(cell.getStringCellValue());
				return text;
				
			}
			else {
				double d = cell.getNumericCellValue();
				long l=(long) d;
				String name = String.valueOf(l);
				return name;
			}
		}
		if (cellType==1) {
			String str = cell.getStringCellValue();
			return str;
		}
		return null;
	}
	
	//Excel Write
		public void excelWrite(String loc, String SheetName, String data, int rowNumber, int cellNumber) throws Exception {
			FileOutputStream stream=new FileOutputStream(new File(loc));
			Workbook wb=new XSSFWorkbook();
			Sheet sName = wb.createSheet(SheetName);
			Row createRow = sName.createRow(rowNumber);
			Cell createCell = createRow.createCell(cellNumber);
			
			createCell.setCellValue(data);
			
			wb.write(stream);
			
			
			
		}
		//Excel Update
				public void excelUpdate(String loc, String SheetName,String data, int rowNumber, int cellNumber) throws Exception {
					FileInputStream stream=new FileInputStream(new File(loc));
					Workbook wb=new XSSFWorkbook(stream);
					Sheet sheet = wb.getSheet(SheetName);
					Row row = sheet.createRow(rowNumber);
					Cell cell = row.createCell(cellNumber);
					cell.setCellValue(data);
					FileOutputStream fos=new FileOutputStream(new File(loc));
					wb.write(fos);
					
					
				}
				
				public void selectByInd(WebElement element, int index) {
					Select s=new Select(element);
					s.selectByIndex(index);
				}	
				
		public void selectByvalue(WebElement element, String data) {
			Select s=new Select(element);
			s.selectByValue(data);
		}		
		
		public void selectByVisibletext(WebElement element, String value) {
			Select s=new Select(element);
			s.selectByVisibleText(value);		}	
		
	
	public void quit() {
		driver.quit();

	}
	
	
	
}
