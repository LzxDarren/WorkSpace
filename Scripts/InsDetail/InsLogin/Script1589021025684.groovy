import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser('')
//WebUI.getWindowIndex()
//boolean t = WebUI.verifyElementPresent(findTestObject('Object Repository/InsLogin/Page_/title'), 1);
//if(t==false){

//}
WebUI.click(findTestObject('Object Repository/InsLogin/Page_/span_'))

WebUI.setText(findTestObject('Object Repository/InsLogin/Page_/input__el-input__inner'), 'insdarren')

WebUI.setEncryptedText(findTestObject('Object Repository/InsLogin/Page_/input__el-input__inner_1'), 'aeHFOx8jV/A=')

WebUI.dragAndDropByOffset(findTestObject('Object Repository/InsLogin/Page_/i__el-icon-d-arrow-right'), 435, 0)

WebUI.click(findTestObject('Object Repository/InsLogin/Page_/button_'))

@com.kms.katalon.core.annotation.SetUp
def Setup() {
//	WebUI.openBrowser('')
//	
//	WebUI.navigateToUrl('http://192.168.0.49:8003/login')
//	
//	WebUI.maximizeWindow()
}

