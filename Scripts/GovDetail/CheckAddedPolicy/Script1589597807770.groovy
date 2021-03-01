import javax.swing.JOptionPane

import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try{
	boolean t2 = CustomKeywords.'commonFunction.Common.checkPolicyType'(policyType);
	boolean err = true;

	KeywordUtil.logInfo("-----------"+t2);

	if (t2 == false) {
		throw new com.kms.katalon.core.exception.StepErrorException("Wrong Policy Type!");
	}

	boolean t6 = CustomKeywords.'commonFunction.Common.checkIframe'('/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[5]/div/div/div/div[1]/div[2]/div[1]/iframe',
			'//body/p', policyDes)

	KeywordUtil.logInfo("-----------"+t6);

	if (t6 == false) {
		throw new com.kms.katalon.core.exception.StepErrorException("Wrong Policy Description!");
	}
	boolean t =CustomKeywords.'commonFunction.Common.checkData'(policyCode, policyName, startTime, endTime, appendixName);
	KeywordUtil.logInfo("-----------"+t);
	if (t) {
		JOptionPane.showMessageDialog(null, "All data is correct!")
		WebUI.back()
	} else {
		throw new com.kms.katalon.core.exception.StepErrorException("Wrong Policy Input value!");
	}
}catch(StepErrorException e){
	this.println(e)
}catch(Exception e){
	this.println(e)
}

