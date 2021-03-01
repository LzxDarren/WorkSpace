import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('icreditBank/bankLogin'), [:], FailureHandling.STOP_ON_FAILURE)

if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/icreditBankLoan/Page_/wait'))){
	
	WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/loanlist'))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/wait'), 2)
	
	WebUI.waitForPageLoad(1)
	
	WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/wait'))
	
}else{
	WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/wait'))
	
	//WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/entername', 2))
	WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/entername'))
	
	//WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/agreeRule', 2))
	boolean flag = WebUI.verifyElementNotPresent(findTestObject('Object Repository/icreditBankLoan/Page_/agreeRule'), 2)
	
	System.out.print('flag----------' + flag)
	
	if (flag == false) {
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/agreeRule')) //WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/logs', 2))
		//WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/addbutton', 2))
		//WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/advice', 2))
	  
		//WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/operator', 2))
	} else {
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/logs'))
	
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/addbutton'))
	
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/advice'))
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/icreditBankLoan/Page_/agree'), 2)
		
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/agree'))
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/operator'), '测试')
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/amount'), '100')
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/rate'), '5.55')
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/time'), '12')
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/way'), '12')
	
		WebUI.setText(findTestObject('Object Repository/icreditBankLoan/Page_/detail'), '测试')
		
		WebUI.click(findTestObject('Object Repository/icreditBankLoan/Page_/comfirm'))
	}
}



