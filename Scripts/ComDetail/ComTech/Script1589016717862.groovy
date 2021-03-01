import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ComDetail/UnClaimComLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ComTech/Page_/div_'))

WebUI.delay(1)

WebUI.click(findTestObject('ComTech/Page_/li_'))

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner'), 'Com1588840867339')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1'), '1000')

WebUI.click(findTestObject('ComTech/Page_/input__el-input__inner_1_2'))

WebUI.click(findTestObject('ComTech/Page_/span_12'))

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3'), '科技')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4'), '服装')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5'), '广州')

WebUI.setText(findTestObject('ComTech/Page_/textarea__el-textarea__inner'), '食品')

WebUI.setText(findTestObject('ComTech/Page_/textarea__el-textarea__inner_1'), '没有')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6'), '黄爷')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7'), '13500000000')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8'), '1')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9'), '2')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10'), '3')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11'), '4')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12'), '5')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13'), '6')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    '7')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    '8')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    '9')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    '10')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    '11')

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    '12')

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner'))

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner - Copy'))

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner - Copy (1)'))

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner - Copy (2)'))

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner - Copy (3)'))

WebUI.click(findTestObject('ComTech/Page_/span__el-checkbox__inner - Copy (4)'))



CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('ComTech/Page_/button_'), 'D:\\Packets\\ces2222.pdf');
//WebUI.waitForElementAttributeValue(findTestObject('ComTech/Page_/button_'), 'text', '重新上传', 5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('ComTech/Page_/button_ - Copy'), 'D:\\Packets\\ces2222.pdf');
//WebUI.waitForElementAttributeValue(findTestObject('ComTech/Page_/button_ - Copy'), 'text', '重新上传', 5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('ComTech/Page_/button_ - Copy (1)'), 'D:\\Packets\\cesces.pdf');
//WebUI.waitForElementAttributeValue(findTestObject('ComTech/Page_/button_ - Copy (1)'), 'text', '重新上传', 5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('ComTech/Page_/button_ - Copy (2)'), 'D:\\Packets\\cesces.pdf');
//WebUI.waitForElementAttributeValue(findTestObject('ComTech/Page_/button_ - Copy (2)'), 'text', '重新上传', 5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('ComTech/Page_/button_ - Copy (3)'), 'D:\\Packets\\cesces.pdf');
//WebUI.waitForElementAttributeValue(findTestObject('ComTech/Page_/button_ - Copy (3)'), 'text', '重新上传', 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ComTech/Page_/button__1'))

WebUI.setText(findTestObject('ComTech/Page_/input__el-input__inner_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    '测试')

WebUI.setText(findTestObject('ComTech/Page_/textarea__el-textarea__inner_1_2'), '测试')

WebUI.click(findTestObject('ComTech/Page_/button__1_2'))

