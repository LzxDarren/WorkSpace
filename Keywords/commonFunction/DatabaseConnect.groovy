package commonFunction

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.sql.Sql
import internal.GlobalVariable

public class DatabaseConnect {
	/**
	 * 数据库连接
	 * @param url 连接地址--含数据库名
	 * @return value  Value of variable
	 */
	@Keyword
	def DBconnect(url,userName,password){
		return Sql.newInstance(url,userName,password,"com.mysql.jdbc.Driver")
	}

	/**
	 * 执行sql
	 * @param  操作数据库对象
	 * @param sql语句
	 * @return value  Value of variable
	 */
	@Keyword
	def executeSql_Core(sql){
		def db_url=GlobalVariable.G_db_url
		def userName=GlobalVariable.G_dbUser
		def password=GlobalVariable.G_dbPassword
		Sql con=new DatabaseConnect().DBconnect(db_url,userName,password)
		def result = con.rows(sql).size()
		con.close()
		con=null
		println result
		return result

	}

	/*** 关闭数据库
	 */
	@Keyword
	def DBclose(Sql db){
		db.close()
		db=null
	}
}
