import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//WebUI.doubleClick(findTestObject('Object Repository/test/Page_/div_'))
//
//WebUI.click(findTestObject('Object Repository/test/Page_/li_'))
//
//CustomKeywords.'commonFunction.Common.updatePoliy'(policyName)

CustomKeywords.'commonFunction.Common.policyType'(policyType)
//WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/span__el-radio__inner'))

WebUI.setText(findTestObject('Object Repository/GovEditAddedPolicy/Page_/input__el-input__inner_1'), policyName)

WebUI.clearText(findTestObject('GovEditAddedPolicy/Page_/startTime'))

WebUI.setText(findTestObject('GovEditAddedPolicy/Page_/startTime'), startTime)

WebUI.clearText(findTestObject('GovEditAddedPolicy/Page_/endTime'))

WebUI.setText(findTestObject('GovEditAddedPolicy/Page_/endTime'), endTime)

WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/outside'))


CustomKeywords.'commonFunction.Common.switchElement'('/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[5]/div/div/div/div[1]/div[2]/div[1]/iframe','//body/p', policyDes)

//WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/p_'))
//WebUI.setText(findTestObject('Object Repository/GovEditAddedPolicy/Page_/body_10011'), '<p style="">测试政策10011啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Object Repository/GovEditAddedPolicy/Page_/button_upload'), 'D:\\Packets\\ces2222.pdf')

WebUI.waitForElementAttributeValue(findTestObject('GovEditAddedPolicy/Page_/appendix'), "text", appendixName, 2)


//WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/button_upload'))
//WebUI.click(findTestObject('Object Repository/GovEditAddedPolicy/Page_/button_submit'))

