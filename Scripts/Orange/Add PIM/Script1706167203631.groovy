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

WebUI.callTestCase(findTestCase('Orange/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Orange/Page_OrangeHRM/firstName'), 'AA')

WebUI.setText(findTestObject('Orange/Page_OrangeHRM/middleName'), 'BB')

WebUI.setText(findTestObject('Orange/Page_OrangeHRM/lastName'), 'CC')

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/div_Employee Id'))

WebUI.setText(findTestObject('Object Repository/Orange/Page_OrangeHRM/Nickname'), '0001')

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/div_Attachments Add'))

WebUI.setText(findTestObject('Object Repository/Orange/Page_OrangeHRM/Nickname'), '12345')

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/div_10'))

WebUI.setText(findTestObject('Object Repository/Orange/Page_OrangeHRM/Nickname'), '222')

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/div_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/span_Male_oxd-radio-input oxd-radio-input--_b0de6e'))

WebUI.setText(findTestObject('Object Repository/Orange/Page_OrangeHRM/Nickname'), 'ASD123')

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Orange/Page_OrangeHRM/button_Save'))

