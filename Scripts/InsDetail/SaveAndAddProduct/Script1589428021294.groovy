import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('InsDetail/InsLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/div_'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/li_'))

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner'), productName)

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span_'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__1'))

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner'), productDes)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner_1'), productFea)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1'), limitLow)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input_-_el-input__inner'), limitHigh)

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner1'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner2'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner3'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner4'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner5'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner6'))

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1_2'), loanTime)

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1_2_3'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/li__1'))

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1_2_3_4'), lowRate)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1_2_3_5'), highRate)

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_1'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_2'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_3'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_4'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_5'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_6'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_7'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_8'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_4_9'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_5_1'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_5_2'))

WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/span__el-checkbox__inner_1_2_3_5_3'))

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner_1_2'), condition)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner_1_2_3'), purpose)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner_1_2_3_4'), example)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/input__el-input__inner_1_2_3_4_5'), link)

WebUI.setText(findTestObject('InsAddOrSaveProduct/Page_/textarea__el-textarea__inner_1_2_3_4_5'), other)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('InsAddOrSaveProduct/Page_/button_'), 'D:\\Packets\\cesces.pdf')

//WebElement element;
//String r;
int n = JOptionPane.showConfirmDialog(null, 'Save Or Publish?', 'Confirm', JOptionPane.YES_NO_OPTION)

if (n == JOptionPane.YES_OPTION) {
    WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/button_save'))

    WebUI.closeBrowser()
} else if (n == JOptionPane.NO_OPTION) {
    WebUI.click(findTestObject('InsAddOrSaveProduct/Page_/button_add'))

//    WebUI.closeBrowser()
}

