package com.srini.excel;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleExcelUtil{
	WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void searchGoogle() throws Exception {
		try {
			String filePath = "./lib/temp.xls";
			File file = new File(filePath);
			assertTrue(file.exists());
			FileInputStream fi = new FileInputStream(file);
			Workbook w = Workbook.getWorkbook(fi);
			Sheet s = w.getSheet(0);
			for (int i = 0; i < s.getRows(); i++) {
				Cell[] cells = s.getRow(i);
				String user = cells[0].getContents();
				String password = cells[1].getContents();
				System.out.println("username: " + user + "password: "
						+ password);
				driver.get("http://www.gmail.com");
				driver.findElement(By.name("Email")).sendKeys(user);
				driver.findElement(By.name("Passwd")).sendKeys(password);
				driver.findElement(By.name("signIn")).click();
				Thread.sleep(30000);
				driver.findElement(By.xpath("//*[@id='gbi4t']")).click();
				driver.findElement(By.xpath("//*[@id='gb_71']")).click();
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
