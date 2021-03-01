import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.swing.JOptionPane

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ComDetail/ComLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/div_loanManagement'))

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/li_applyProduct'))

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/span_viewProducts'))

//WebUI.Element
//WebUI.waitForElementPresent(findTestObject('Object Repository/ComApplyProduct/Page_/p_title'),10)

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/ComApplyProduct/Page_/p_title'), 'text', '贷款产品管理', 2)

CustomKeywords.'commonFunction.Common.applyProduct'(productName)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/button_apply'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/button_agree'))

//input apply info
WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/applyAmount'), applyAmount)

CustomKeywords.'commonFunction.Common.fundType'(fundType)

CustomKeywords.'commonFunction.Common.fundMonth'(fundMonth)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/repayType'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ComApplyProduct/Page_/borrowAndReturn'),2)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/borrowAndReturn'))

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/guaranteeType'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ComApplyProduct/Page_/credit_fund'),2)

WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/credit_fund'))

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/guaranteeInfo'), guaranteeInfo)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/usage'),usage)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/repayResource'),repayResource)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/repayPlan'),repayPlan)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/job'),job)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/name'),name)

WebUI.setText(findTestObject('Object Repository/ComApplyProduct/Page_/mobile'),mobile)

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/ComApplyProduct/Page_/button_financeRep'), 'D:\\Packets\\cesces.pdf')

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/ComApplyProduct/Page_/button_other'), 'D:\\Packets\\ces2222.pdf')

WebUI.delay(3)
//submit
//int n = JOptionPane.showConfirmDialog(null, 'Save Or Apply?', 'Confirm', JOptionPane.YES_NO_OPTION)


//if (n == JOptionPane.YES_OPTION) {
//	WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/button_save'))
//} else if (n == JOptionPane.NO_OPTION) {
	WebUI.click(findTestObject('Object Repository/ComApplyProduct/Page_/button_submit'))
	
//	WebUI.closeBrowser()
//}


