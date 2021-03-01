import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.49:8003/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('ComLogin/Page_/span_'))

WebUI.setText(findTestObject('ComLogin/Page_/input__el-input__inner'), 'Comdev321')

WebUI.setEncryptedText(findTestObject('ComLogin/Page_/input__el-input__inner_1'), 'aeHFOx8jV/A=')

WebUI.dragAndDropByOffset(findTestObject('ComLogin/Page_/i__el-icon-d-arrow-right'), 435, 0)

WebUI.click(findTestObject('ComLogin/Page_/span__1'))

