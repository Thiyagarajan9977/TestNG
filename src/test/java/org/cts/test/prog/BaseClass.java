package org.cts.test.prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchbrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		return driver;		
	}
	
	public static void launchurl(String e) {
		driver.get(e);		
	}

	public static void sendkeys(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static String gettext(WebElement w) {
		return  w.getText();		
	}

	public static String getattribute(WebElement w) {
		return w.getAttribute("value");
	}

	
	// LOCATORS
	
	public static WebElement locators(String Locators, String value) {	
		
		WebElement element= null;		
		
		switch (Locators.toUpperCase()) {
		case "ID":				
			element = driver.findElement(By.id(value));
			//element.click();
			break;

		case "NAME":
			element = driver.findElement(By.name(value));
			//element.click();
			break;
		
		case "CLASSNAME":
			element = driver.findElement(By.className(value));
			//element.click();
			break;
			
		case "XPATH":
			element = driver.findElement(By.xpath(value));
			//element.click();
			break;		
		}
		return element;			
	}
	
	// ACTION CLASS
	
	public static void movetoelements(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void clickaction() {
		Actions a = new Actions(driver);
		a.click().perform();
	}

	public static void doubleclick(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public static void draganddrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void contextclick(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}

	public static void clickandhold(WebElement target) {
		Actions a = new Actions(driver);
		a.clickAndHold(target).perform();
	}

	public static void release(WebElement target) {
		Actions a = new Actions(driver);
		a.release(target).perform();
	}
	
	//Alert
	
	public static void accept() {		
		driver.switchTo().alert().accept();
	}
	
	public static void dismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String alertgettext() {
		String text = driver.switchTo().alert().getText();
		return text;		
	}
	
	public static void alertsendkeys(String s) {
		driver.switchTo().alert().sendKeys(s);
	}
	
	//selectclass
	
	public static void selectclass(String methods, WebElement refvalue, String value) {		
			Select s;
		
		switch (methods.toUpperCase()) {
		case "byvalue":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "byvisibletext":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
		
		case "byindex":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "getoptions":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "getallselectedoptions":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "getfirstselectedoptions":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "ismultiple":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "deselectbyindex":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "deselectbyvalue":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "deselectbyvisibletext":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
			
		case "deselectall":
			s = new Select(refvalue);
			s.selectByValue(value);			
			break;
		}
	}
	
	
	//iframes
	
	public static WebDriver element(WebElement frameElement) {
		WebDriver frame = driver.switchTo().frame(frameElement);
		return frame;

	}
	
	public static WebDriver index(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;

	}
	
	public static WebDriver nameorid(String nameorid ) {
		WebDriver frame = driver.switchTo().frame(nameorid);
		return frame;	
	}
	
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}
	
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	
	// windowshandling
	
	public static String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	
	public static Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
		
	//JAVASCRIPT EXECUTOR
	
	public static void scrollup(WebElement target) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", target);
	}
	
	public static void scrolldown(WebElement target) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", target);
	}
	
	public static void jsgetattribute (WebElement target) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", target);		
	}	
	
	public static void clickbyjs(WebElement target) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", target);
	}
	
	//TakeScreenshotAS
	
	public static void screenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot.\\Image" + System.currentTimeMillis()+".png");		
		FileUtils.copyFile(srcFile, destFile);	
	}
	
	// Excelupdate
	
	public static void getexceldata(String path, String sheetname, int rowno, int cellno) throws IOException {
	
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook wo = new XSSFWorkbook(fi);
		Sheet sheet = wo.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int cellType = cell.getCellType();
		
		String value = null;
		
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();			
		}else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
				 value = sf.format(dateCellValue);				
			} else {
					
				double numericCellValue = cell.getNumericCellValue();
				long ln = (long) numericCellValue;
				 value = String.valueOf(ln);				 
			}		
		}
	}	
	
	// BROWSER QUIT
	
	public static void close () {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	

}
