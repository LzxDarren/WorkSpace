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

WebUI.openBrowser()

WebUI.navigateToUrl('http://192.168.0.13:8003/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/icreditBankLogin/Page_/bank'))

WebUI.setText(findTestObject('Object Repository/icreditBankLogin/Page_/user'), 'Ins1595919455797')

WebUI.setEncryptedText(findTestObject('Object Repository/icreditBankLogin/Page_/password'), 'M585lTQi+6UrPoSNT9EzHw==')

WebUI.dragAndDropByOffset(findTestObject('Object Repository/icreditBankLogin/Page_/i__el-icon-d-arrow-right'), 435, 0)

WebUI.click(findTestObject('Object Repository/icreditBankLogin/Page_/login'))

WebUI.click(findTestObject('Object Repository/icreditBankLogin/Page_/ok'))




