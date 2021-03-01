import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('GovDetail/GovLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/GovAuditLoan/Page_/div_arrange'),1)

WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/div_arrange'))

WebUI.waitForElementPresent(findTestObject('Object Repository/GovAuditLoan/Page_/li_loanManagement'),1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/li_loanManagement'))

WebUI.delay(2)

CustomKeywords.'commonFunction.Common.govAuditBtn'(bankName, companyName)
//WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/check'))

WebUI.waitForElementPresent(findTestObject('Object Repository/GovAuditLoan/Page_/button_add'),2)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/button_add'))

CustomKeywords.'commonFunction.Common.auditType'(auditType)
//WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/pass_radio'))

WebUI.setText(findTestObject('Object Repository/GovAuditLoan/Page_/agreeAmount'), agreeAmount)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/GovAuditLoan/Page_/button_upload'), 'D:\\Packets\\cesces.pdf')
//WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/button_upload'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/GovAuditLoan/Page_/button_submit'),2)

WebUI.click(findTestObject('Object Repository/GovAuditLoan/Page_/button_submit'))

//WebUI.closeBrowser()

