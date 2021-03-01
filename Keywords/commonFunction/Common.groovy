package commonFunction


import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Common {
	WebDriver driver = DriverFactory.getWebDriver()
	//	WebElement elem = driver.findElement(By.xpath("(//input[@type='text'])[6]"))

	//	@Keyword
	//	def toBeClicked (TestObject to) {
	//		WebDriver driver = new ChromeDriver()
	//		WebDriverWait(driver,10).until(expected_conditions.element_to_be_selected(to))
	//		Boolean result=WebDriverWait(driver,10).until(expected_conditions.element_selection_state_to_be(to,True))
	//		return result;
	//	}
	//
	//	public static String getInputValue(WebDriver driver ,WebElement element)
	//	{
	//		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
	//		try
	//		{
	//			String value = javaScriptExecutor.executeScript("return arguments[0].value", element).toString();
	//			return value;
	//		}
	//		catch (Exception e)
	//		{
	//			e.printStackTrace();
	//			return null;

	//		}


	//Government
	@Keyword
	def switchElement(String to, String set, String des) {
		WebElement element = driver.findElement(By.xpath(to));

		driver.switchTo().frame(element);
		WebElement element1 = driver.findElement(By.xpath(set));
		//		WebUI.verifyElementPresent(ver), 1, FailureHandling.STOP_ON_FAILURE);
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"),des);
		//		WebUI.setText(element1, '测试政策啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊');
		driver.switchTo().defaultContent();
		//		WebElement element = WebUI.findWebElement(to);
	}

	@Keyword
	def updatePolicy(String code){
		WebElement element = driver.findElement(By.xpath("(//*[normalize-space(.)='$code'])[1]/following::span[2]"))
		element.click()
	}
	//		 catch (WebElementNotFoundException e)
	//
	//		KeywordUtil.markFailed("No this Element")
	//
	//		}

	@Keyword
	def policyType(String code){
		//(.//*[normalize-space(text()) and normalize-space(.)='金融扶持政策'])[1]
		WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$code'])[1]"))
		element.click()
	}

	@Keyword
	def dismountPolicy(String code){
		WebElement element = driver.findElement(By.xpath("(//*[normalize-space(.)='$code'])[1]/following::span[3]"))
		element.click()
		//		os.system()
		//		SendKeys.SendKeys('D:\\Packets\\ces2222.pdf')
	}

	@Keyword
	def checkAddedPolicy(String code){
		WebElement element = driver.findElement(By.xpath("(//*[normalize-space(.)='$code'])[1]/following::span[1]"))
		element.click()
	}

	//(//*[normalize-space(.)='金融扶持政策'])[1]
	@Keyword
	def checkPolicyType(String code){
		WebElement element = driver.findElement(By.xpath("(//*[normalize-space(.)='$code'])/span/input"));
		KeywordUtil.logInfo("333333333333333333333"+element.isSelected());
		return element.isSelected();
	}

	@Keyword
	def checkIframe(String to, String set, String tem){
		WebElement element = driver.findElement(By.xpath(to));
		driver.switchTo().frame(element);
		WebElement element1 = driver.findElement(By.xpath(set));
		String t = element1.getText();
		KeywordUtil.logInfo("111111111111111111111"+t);
		KeywordUtil.logInfo("222222222222222222222"+tem);
		driver.switchTo().defaultContent();
		return t == tem;
	}

	@Keyword
	def checkData(String q, String w, String e, String r, String t){
		String policyCode = driver.findElement(By.xpath('//*[@id="app"]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div/div/input')).getAttribute('value');
		KeywordUtil.logInfo(policyCode + " "+ q);
		String policyName = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getAttribute('value');
		String startTime = driver.findElement(By.xpath('//*[@id="app"]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[4]/div/div/input[1]')).getAttribute('value');
		String endTime = driver.findElement(By.xpath('//*[@id="app"]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[4]/div/div/input[2]')).getAttribute('value');
		String appendixName = driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[6]/div/div/div/div/div/span/i[2]")).getText();
		if(policyCode.equals(q)&&policyName.equals(w)&&startTime.equals(e)&&endTime.equals(r)&&appendixName.equals(t)){
			return true;
		}else{
			return false;
		}
	}

	//Company

	////*/text()[normalize-space(.)='测试产品0518']/following::div[14]
	@Keyword
	def applyProduct(String name){
		WebElement element = driver.findElement(By.xpath("//*/text()[normalize-space(.)='$name']/following::div[14]"))
		element.click()
	}

	////*/text()[normalize-space(.)='可循环流动资金']/preceding::span[1]
	@Keyword
	def fundType(String t){
		WebElement element = driver.findElement(By.xpath("//*/text()[normalize-space(.)='$t']/preceding::span[1]"))
		element.click()
	}

	////*/span[contains(text(),'18')]/preceding::span[1]
	@Keyword
	def fundMonth(String t){
		WebElement element = driver.findElement(By.xpath("//*/span[contains(text(),'$t')]/preceding::span[1]"))
		element.click()
	}

	//Ins

	////*/span[contains(text(),'听说')]/preceding::td/div[contains(text(),'0518')]/preceding::td/div/span[@class="text-button"][contains(text(),'审核')]
	@Keyword
	def auditBtn(String c,String p){
		WebElement element = driver.findElement(By.xpath("//*/span[contains(text(),'$c')]/ancestor-or-self::tr/td/div[contains(text(),'$p')]/ancestor-or-self::tr/td/div/span[@class='text-button'][contains(text(),'审核')]"))
		element.click()
	}

	////div[5]/div/div/label/span/following::span[contains(text(),'一般流动')]/preceding::span[1]
	@Keyword
	def auditType(String t){
		WebElement element = driver.findElement(By.xpath("//*/span[contains(text(),'$t')]/preceding::span[1]"))
		element.click()
	}

	@Keyword
	def loanType(String t){
		WebElement element = driver.findElement(By.xpath("//div[5]/div/div/label/span/following::span[contains(text(),'$t')]/preceding::span[1]"))
		element.click()
	}

	////label[@role='radio'][normalize-space(.)='逾期30天以上']/span[1]
	@Keyword
	def loanStatus(String t){
		WebElement element = driver.findElement(By.xpath("//label[@role='radio'][normalize-space(.)='$t']/span[1]"))
		element.click()
	}

	@Keyword
	def updateBtn(String c,String p){
		WebElement element = driver.findElement(By.xpath("//*/div[contains(text(),'$c')]/ancestor-or-self::tr/td/div[contains(text(),'$p')]/ancestor-or-self::tr/td/div/span[@class='text-button'][contains(text(),'更新状态')]"))
		element.click()
	}

	@Keyword
	def repayType(String t){
		WebElement element = driver.findElement(By.xpath("//ul[@class='el-scrollbar__view el-select-dropdown__list']/li/span[text()='$t']"))
		element.click()
		KeywordUtil.logInfo("------------"+t);
		//		KeywordUtil.logInfo(driver.findElement(By.xpath("//label[normalize-space(.)='还款方式']/following::div[@class='el-scrollbar']/div/ul/li/span[text()='$t']")));
	}

	//Gov
	////*/div[contains(text(),'超人')]/ancestor-or-self::tr/td/div[contains(text(),'')]/ancestor-or-self::tr/td/div/span[@class='text-button'][contains(text(),'审核')]
	@Keyword
	def govAuditBtn(String b, String c){
		WebElement element = driver.findElement(By.xpath("//*/div[contains(text(),'$b')]/ancestor-or-self::tr/td/div[contains(text(),'$c')]/ancestor-or-self::tr/td/div/span[@class='text-button'][contains(text(),'审核')]"))
		element.click()
	}

	@Keyword
	def comTechAppGrt(String t){
		//*/span[normalize-space(.)='是']
		WebElement element = driver.findElement(By.xpath("//*/span[normalize-space(.)='$t']"))
		element.click()

	}


	//	Common Keywords
	@Keyword
	def spanName(String t){
		WebElement element = driver.findElement(By.xpath("//*/span[normalize-space(.)='$t']"))
		element.click()
	}

	@Keyword
	def liName(String t){
		WebElement element = driver.findElement(By.xpath("//*/li[normalize-space(.)='$t']"))
		element.click()
	}

	@Keyword
	def inputNameOrStartTime(String t){
		WebElement element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::input[1]"))
		element.click()
	}

	@Keyword
	def inputNameOrEndTime(String t){
		WebElement element = driver.findElement(By.xpath("//*/label[contains(text(),'$t')]/following::input[2]"))
		element.click()
	}

	//	@Keyword
	//	def iframeName(String t, String des) {
	//		WebElement element2 = driver.findElement(By.xpath('//*/label[contains(text(),'$t')]/following::iframe'))
	//		driver.switchTo().frame(element2);
	//		WebElement element3 = driver.findElement(By.xpath('//body/p'));
	//		//		WebUI.verifyElementPresent(ver), 1, FailureHandling.STOP_ON_FAILURE);
	//		element3.sendKeys(Keys.chord(Keys.CONTROL, "a"),des);
	//		//		WebUI.setText(element1, '测试政策啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊');
	//		driver.switchTo().defaultContent();
	//	}
}




