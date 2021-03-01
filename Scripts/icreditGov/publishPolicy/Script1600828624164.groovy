import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('icreditGov/govLogin'), [('account') : 'gov03', ('password') : '123456'], FailureHandling.STOP_ON_FAILURE)

//ele = CustomKeywords.'commonFunction.CommonTest.spanName'(v1)
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/test/test'), 10)

//WebUI.click(findTestObject('Object Repository/test/test'))

CustomKeywords.'commonFunction.CommonTest.liName'(v2)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v3, id)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v4, pub)

CustomKeywords.'commonFunction.CommonTest.clickInput'(v5)

CustomKeywords.'commonFunction.CommonTest.liName'(type)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v6, daystart)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrEndTime'(v6, dayend)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v7, postart)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrEndTime'(v7, poend)

CustomKeywords.'commonFunction.CommonTest.textareaName'(v8, resource)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v9, name)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v10, phone)

CustomKeywords.'commonFunction.CommonTest.setinputNameOrStartTime'(v11, address)

CustomKeywords.'commonFunction.CommonTest.switchElement'(v12, content)

element = CustomKeywords.'commonFunction.CommonTest.uploadButton'(v13)

CustomKeywords.'uploadFile.upload.uploadFile'(element, appendix)

CustomKeywords.'commonFunction.CommonTest.buttonClick'('发布政策')

def checkData(String id) {
	sql = ('select count(1) from CM_POLICY where code=' + id)

	result = CustomKeywords.'commonFunction.DatabaseConnect.executeSql_Core'(sql)

	return result
}

checkData(temp)


