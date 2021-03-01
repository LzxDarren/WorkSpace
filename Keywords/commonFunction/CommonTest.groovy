package commonFunction

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable


public class CommonTest {
	WebDriver driver = DriverFactory.getWebDriver();
	//	driver.implicitly_wait(20)
	WebElement element;


	//	Common Keywords
	@Keyword
	def switchElement(String t, String des) {
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::iframe"));
		driver.switchTo().frame(element);
		WebElement element1 = driver.findElement(By.xpath("//body/p"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, 'a'),des);
		driver.switchTo().defaultContent();

	}

	@Keyword
	def spanName(String t){
		WebDriverWait wait =new WebDriverWait(driver, 20)
		element = driver.findElement(By.xpath("//*/span[normalize-space(.)='$t']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element)
		element.click()
		//		element.wait()
		//		WebDriverWait wait;
		//		wait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/span[normalize-space(.)='$t']")))
		//		isElementPresent(driver,By.xpath("//*/span[normalize-space(.)='$t']"))
		//		element.click()
	}

	@Keyword
	def liName(String t){
		element = driver.findElement(By.xpath("//*/li[normalize-space(.)='$t']"))
		element.click()
	}

	@Keyword
	def setinputNameOrStartTime(String t, String v){
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::input[1]"))
		element.sendKeys(Keys.chord(Keys.CONTROL, 'a'),v)
	}

	@Keyword
	def setinputNameOrEndTime(String t, String v){
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::input[2]"))
		element.sendKeys(Keys.chord(Keys.CONTROL, 'a'),v)
	}

	@Keyword
	def clickInput(String t){
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::input[1]"))
		element.click()
	}

	@Keyword
	def buttonClick(String t){
		element = driver.findElement(By.xpath("//*/button/span[contains(text(),'$t')]"))
		element.click()
	}

	@Keyword
	def uploadButton(String t){
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::button[1]"))
		return element
	}

	@Keyword
	def textareaName(String t, String v){
		element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::textarea[1]"))
		element.sendKeys(Keys.chord(Keys.CONTROL, 'a'),v)
	}

	//	Customize
	@Keyword
	def commonClick(String t){
		element = driver.findElement(By.xpath(t))
		element.click()
	}
	@Keyword
	def commonSet(String t, String v){
		element = driver.findElement(By.xpath(t))
		element.sendKeys(Keys.chord(Keys.CONTROL, 'a'),v)
	}
}
