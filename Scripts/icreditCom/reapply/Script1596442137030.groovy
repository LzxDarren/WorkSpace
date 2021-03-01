import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.scrollToElement(findTestObject('Object Repository/icreditComLogin/reapply/applybutton'), 0)

WebUI.click(findTestObject('Object Repository/icreditComLogin/reapply/applybutton'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/operator'), 2)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/operator'), '测试测试测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/reason'), '啊啊啊啊啊啊')

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/confirm'))

