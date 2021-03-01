import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.swing.JOptionPane

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.callTestCase(findTestCase('GovDetail/GovLogin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('GovDetail/GovLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/div_'))

WebUI.click(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/li_'))

WebUI.setText(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/input__el-input__inner'), policyCode)

CustomKeywords.'commonFunction.Common.policyType'(policyType)

//WebUI.click(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/span__el-radio__inner'))

WebUI.setText(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/input__el-input__inner_1'), policyName)

WebUI.setText(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/div_1'),startTime)

WebUI.setText(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/span_31'),endTime)

WebUI.click(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/outside'))

//WebDriver driver = DriverFactory.getWebDriver()
//driver.switchTo().parentFrame()
CustomKeywords.'commonFunction.Common.switchElement'('/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[5]/div/div/div/div[1]/div[2]/div[1]/iframe', '//body/p',policyDes)

//WebUI.switchToFrame(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/iframe__tiny-vue_48099049221589446553155_ifr'), 3)
//WebUI.verifyElementPresent(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/p (1)'), 1, FailureHandling.STOP_ON_FAILURE)
//WebUI.setText(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/p (1)'), '测试政策')
//WebUI.switchToDefaultContent()
//WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_uploadFile'))
CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('GovAddOrSavePolicy/Page_/button_uploadFile'), 'D:\\Packets\\cesces.pdf')

int n = JOptionPane.showConfirmDialog(null, 'Publish Or Save?', 'Confirm', JOptionPane.YES_NO_OPTION);
if (n == JOptionPane.YES_OPTION) {
	WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_Add'))
	WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/title'), 'text', '已发布政策', 3)
	int t = JOptionPane.showConfirmDialog(null, 'Continue to Update?', 'Confirm', JOptionPane.YES_NO_OPTION)

	if (t == JOptionPane.YES_OPTION) {
		CustomKeywords.'commonFunction.Common.updatePolicy'(policyCode)
		WebUI.callTestCase(findTestCase('GovDetail/UpdateAddedPolicy'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/button_submit'))
		//Check updated date
		WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/title'), 'text', '已发布政策', 3)
		CustomKeywords.'commonFunction.Common.checkAddedPolicy'(policyCode)
		WebUI.callTestCase(findTestCase('GovDetail/CheckAddedPolicy'), [:], FailureHandling.STOP_ON_FAILURE)

		//Disamount policy
		int d = JOptionPane.showConfirmDialog(null, 'Disamount Or Not?', 'Confirm', JOptionPane.YES_NO_OPTION)
		if (d == JOptionPane.YES_OPTION) {
			CustomKeywords.'commonFunction.Common.dismountPolicy'(policyCode)
			WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_disamount'))
		}
	}
} else if (n == JOptionPane.NO_OPTION) {
	WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_Save'))
	WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/title'), 'text', '未发布政策', 3)
	int x = JOptionPane.showConfirmDialog(null, 'Continue to Update?', 'Confirm', JOptionPane.YES_NO_OPTION)
	if (x == JOptionPane.YES_OPTION) {
		CustomKeywords.'commonFunction.Common.updatePolicy'(policyCode)
		WebUI.callTestCase(findTestCase('GovDetail/UpdateAddedPolicy'), [:], FailureHandling.STOP_ON_FAILURE)
		int y = JOptionPane.showConfirmDialog(null, 'Publish Or Save?', 'Confirm', JOptionPane.YES_NO_OPTION)
		if (y == JOptionPane.YES_OPTION) {
			WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/button_submit'))

			//Check updated date
			WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/title'), 'text', '已发布政策', 3)
			CustomKeywords.'commonFunction.Common.checkAddedPolicy'(policyCode)
			WebUI.callTestCase(findTestCase('GovDetail/CheckAddedPolicy'), [:], FailureHandling.STOP_ON_FAILURE)

		}else if (y == JOptionPane.NO_OPTION) {
			WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_Save'))

			//Check updated date
			WebUI.waitForElementAttributeValue(findTestObject('Object Repository/GovAddOrSavePolicy/Page_/title'), 'text', '未发布政策', 3)
			CustomKeywords.'commonFunction.Common.checkAddedPolicy'(policyCode)
			WebUI.callTestCase(findTestCase('GovDetail/CheckAddedPolicy'), [:], FailureHandling.STOP_ON_FAILURE)

			//Delete policy
			int z = JOptionPane.showConfirmDialog(null, 'Delete Or Not?', 'Confirm', JOptionPane.YES_NO_OPTION)
			if (z == JOptionPane.YES_OPTION) {
				CustomKeywords.'commonFunction.Common.dismountPolicy'(policyCode)
				WebUI.click(findTestObject('GovAddOrSavePolicy/Page_/button_delete'))
			}
		}
	}
}

