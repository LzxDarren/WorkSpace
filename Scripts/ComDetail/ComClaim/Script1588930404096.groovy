import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.callTestCase(findTestCase('ComDetail/UnClaimComLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner'), '土豆土豆土豆土豆')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1'), 'NoZenp8966')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2'), '啊啊啊啊')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3'), '342625198012232850')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4'), '18318851403')

String test = WebUI.getText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4'));
KeywordUtil.logInfo(test);
//println "-------------------"+ WebUI.getText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4')).length();

WebUI.click(findTestObject('Object Repository/ComClaim/Page_/button_sentVerCode'))


//String result=WebUI.getText(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'), FailureHandling.STOP_ON_FAILURE);
//int i = Integer.parseInt(result);
//while(result<=6){
//
//	result=WebUI.getText(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'), FailureHandling.STOP_ON_FAILURE);
//	KeywordUtil.logInfo("++++++++++++++++"+result.length());
//	println "++++++++++++++++"+result.length();
//}
//result=CustomKeywords.'commonFunction.Common.toBeClicked'(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'));
//if(result==true){
//	
//}
//WebDriverWait(WebUIDriverType.CHROME_DRIVER,10).until(expected_conditions.element_to_be_selected(to))

//WebDriver driver = new ChromeDriver();
//WebElement elem = driver.findElement(By.xpath("(//input[@type='text'])[6]"))
//WebUI.waitForElementClickable(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'), 20, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.wait.waitForElementNotClickable(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'), 20)
//
//WebUI.waitForElementAttributeValue(findTestObject('Object Repository/ComClaim/Page_/input_mobileCode'), text, null, 0)


WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5'), 'q@qq.com')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6'), '123456')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/textarea__el-textarea__inner'), '测试')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7'), 'http://123.com')

WebUI.click(findTestObject('Object Repository/ComClaim/Page_/span_'))

WebUI.click(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/ComClaim/Page_/li_'))

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9'), '测试')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10'), 'http://123.com')

WebUI.click(findTestObject('Object Repository/ComClaim/Page_/button_'))

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11'), '测试')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12'), '测试')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13'), '13500000000')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '342625198012232850')

WebUI.setText(findTestObject('Object Repository/ComClaim/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '123456')

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/ComClaim/Page_/span__1'), 'D:\\Packets\\5e726e443026d4f9766e95e39c145109.jpg')



//WebUI.uploadFile(findTestObject('Object Repository/ComClaim/Page_/span__1'), 'D:\\Packets\\5e726e443026d4f9766e95e39c145109.jpg')

