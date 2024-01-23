import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/overview.htm')

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Accounts Overview/a_Find Transactions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/select_13566                               _8ec6a7'), 
    '13788', true)

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/input_Find by Transaction ID_criteria.trans_18ad5c'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/button_Find Transactions'))

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/a_Find Transactions'))

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/button_Find Transactions'))

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/input_Find by Transaction ID_criteria.trans_18ad5c'), 
    '123')

WebUI.doubleClick(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/input_Find by Transaction ID_criteria.trans_18ad5c'))

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/input_Find by Transaction ID_criteria.trans_18ad5c'), 
    '13566')

WebUI.selectOptionByValue(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/select_13566                               _8ec6a7'), 
    '13788', true)

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/button_Find Transactions'))

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Find Transactions/input_Find by Date_criteria.onDate'), 
    '23-')

