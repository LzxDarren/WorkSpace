import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('InsDetail/InsLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/loanManagement'))

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/waitForAudit'))

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/InsAuditLoan/Page_/p_title'), 'text', '待审核', 2)

CustomKeywords.'commonFunction.Common.auditBtn'(companyName, productName)

//WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/check'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsAuditLoan/Page_/button_add'),5)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/button_add'))

CustomKeywords.'commonFunction.Common.auditType'(auditType)
//WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/passRadio'))

WebUI.setText(findTestObject('Object Repository/InsAuditLoan/Page_/agreeAmount'), agreeAmount)

WebUI.setText(findTestObject('Object Repository/InsAuditLoan/Page_/agreeRate'), agreeRate)

CustomKeywords.'commonFunction.Common.loanType'(loanType)
//WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/loanType'))

WebUI.setText(findTestObject('Object Repository/InsAuditLoan/Page_/loanTime'), loanTime)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/repayType'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsAuditLoan/Page_/borrowAndReturn'),1)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/borrowAndReturn'))

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/guaranteeType'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsAuditLoan/Page_/credit_fund'),1)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/credit_fund'))

WebUI.waitForElementPresent(findTestObject('Object Repository/InsAuditLoan/Page_/info_label'), 1)

WebUI.setText(findTestObject('InsAuditLoan/Page_/guaranteeInfo'), guaranteeInfo)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/InsAuditLoan/Page_/button_upload'), 'D:\\Packets\\测试样本.pdf')
//WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/button_upload'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/InsAuditLoan/Page_/button_submit'),5)

WebUI.click(findTestObject('Object Repository/InsAuditLoan/Page_/button_submit'))

//WebUI.closeBrowser()

