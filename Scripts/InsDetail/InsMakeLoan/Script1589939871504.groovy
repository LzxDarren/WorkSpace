import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('InsDetail/InsLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/InsMakeLoan/Page_/div_loanManagement'),1)

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/div_loanManagement'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsMakeLoan/Page_/li_audited'),1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/li_audited'))

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/InsMakeLoan/Page_/p_title'), 'text', '已审核', 2)

WebUI.delay(1)

CustomKeywords.'commonFunction.Common.updateBtn'(companyName, productName)
//WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/update'))

CustomKeywords.'commonFunction.Common.loanStatus'(loanStatus)
//WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/audit_status'))

WebUI.setText(findTestObject('Object Repository/InsMakeLoan/Page_/agree_loan'), agreeAmount)

//WebUI.clearText(findTestObject('Object Repository/InsMakeLoan/Page_/agree_loan'))

WebUI.setText(findTestObject('Object Repository/InsMakeLoan/Page_/input__el-input__inner'), agreeRate)

CustomKeywords.'commonFunction.Common.loanType'(loanType)
//WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/loanType'))

WebUI.setText(findTestObject('Object Repository/InsMakeLoan/Page_/loanTime'), loanTime)

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/returnType'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsMakeLoan/Page_/borrowAndReturn'),2)

//CustomKeywords.'commonFunction.Common.repayType'('先息后本')
WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/borrowAndReturn'))

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/guaranteeType'))

WebUI.waitForElementPresent(findTestObject('InsMakeLoan/Page_/credit_fund'),2)

//WebUI.click(findTestObject('InsMakeLoan/Page_/credit_fund'))
CustomKeywords.'commonFunction.Common.repayType'('一般担保')

WebUI.waitForElementPresent(findTestObject('Object Repository/InsMakeLoan/Page_/guaranteeInfo'),2)

WebUI.setText(findTestObject('Object Repository/InsMakeLoan/Page_/guaranteeInfo'), guaranteeInfo)

//WebUI.clearText(findTestObject('Object Repository/InsMakeLoan/Page_/guaranteeInfo'))

WebUI.setText(findTestObject('Object Repository/InsMakeLoan/Page_/input__el-input__inner_1'), agreeDate)

//WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/label_'))

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/InsMakeLoan/Page_/button_upload'), 'D:\\Packets\\cesces.pdf')
//WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/button_upload'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/InsMakeLoan/Page_/button_submit'),2)

WebUI.click(findTestObject('Object Repository/InsMakeLoan/Page_/button_submit'))

//WebUI.closeBrowser()

