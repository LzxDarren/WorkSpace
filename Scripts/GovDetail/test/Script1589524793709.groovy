import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('GovDetail/GovLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/test/Page_/div_'))

//WebUI.doubleClick(findTestObject('Object Repository/test/Page_/div_'))
WebUI.click(findTestObject('Object Repository/test/Page_/li_'))

CustomKeywords.'commonFunction.Common.checkAddedPolicy'(policyCode)

WebUI.callTestCase(findTestCase('GovDetail/CheckAddedPolicy'), [('policyDes') : '测试政策啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊测试政策10010啊啊啊啊啊啊啊呃呃呃呃呃怕怕怕怕反反复复烦烦烦'
        , ('policyType') : '金融扶持政策', ('policyName') : '测试政策100111', ('startTime') : '2020-05-05', ('endTime') : '2020-07-01'
        , ('policyCode') : '10010', ('appendixName') : 'ces2222.pdf'], FailureHandling.STOP_ON_FAILURE)

