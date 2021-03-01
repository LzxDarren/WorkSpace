import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (1)'), 2)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (1)'))

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (2)'))

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (3)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (4)'), 2)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (4)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (5)'), 2)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (5)'))

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (30)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/select30'), 2)

CustomKeywords.'commonFunction.Common.comTechAppGrt'(grt)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (6)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/select6'), 2)

CustomKeywords.'commonFunction.Common.comTechAppGrt'(risk)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (7)'), contact)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (8)'), account)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (9)'), bank)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (10)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/select10'), 2)

CustomKeywords.'commonFunction.Common.comTechAppGrt'(newtech)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (11)'), variable)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (12)'), variable_0)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (13)'), variable_1)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (14)'), fundres)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (15)'), phone)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (16)'), email)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (17)'), '测试测试测试测试测试')

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (18)'))

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (19)'), '100')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (20)'), '12')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (21)'), '测试测试测试测试测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (22)'), '测试测试测试测试测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (23)'), '测试测试测试测试测试')

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (24)'))

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/2'), '测试测试测试测试测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (25)'), '测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (26)'), '测试啊')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (27)'), '质押啊')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/2 (1)'), '测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/2 (2)'), '测试')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/2 (3)'), '质押')

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (28)'), 
    'D:\\Packets\\ces2222.pdf')

//WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (28)'))
WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (29)'), 2)

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/ (29)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/operator'), 2)

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/operator'), 'ces')

WebUI.setText(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/reason'), '测试啊')

WebUI.click(findTestObject('Object Repository/icreditComLogin/applyTech/Page_/confirm'))

