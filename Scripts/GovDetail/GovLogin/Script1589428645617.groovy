import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://192.168.0.49:8003/login')
//
//WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/GovLogin/Page_/span_'))

WebUI.setText(findTestObject('Object Repository/GovLogin/Page_/input__el-input__inner'), 'govdarren')

WebUI.setEncryptedText(findTestObject('Object Repository/GovLogin/Page_/input__el-input__inner_1'), 'aeHFOx8jV/A=')

WebUI.dragAndDropByOffset(findTestObject('Object Repository/GovLogin/Page_/i__el-icon-d-arrow-right'), 435, 0)

WebUI.click(findTestObject('Object Repository/GovLogin/Page_/button_'))
