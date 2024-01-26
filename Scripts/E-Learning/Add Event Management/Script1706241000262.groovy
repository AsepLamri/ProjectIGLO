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

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/a_Event Management'))

WebUI.click(findTestObject('E-Learning/Page_Master Offline Training  Elearning CMS/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/input_Title_title'), 
    'Test')

WebUI.setText(findTestObject('E-Learning/Page_Master Offline Training  Elearning CMS/input_Date_date'), '12/12/2023')

WebUI.setText(findTestObject('E-Learning/Page_Master Offline Training  Elearning CMS/input_Start Time_startTime'), '08:30')

WebUI.setText(findTestObject('E-Learning/Page_Master Offline Training  Elearning CMS/input_End Time_endTime'), '17:30')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/input_Link of the session_linkSession'))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/input_Link of the session_linkSession'), 
    'Pengujian API Dengan Katalon')

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/input_Location_location'), 
    'Jakarta')

WebUI.takeScreenshotAsCheckpoint('Input form')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Offline Training  Elearning CMS/button_Save'))

WebUI.takeScreenshotAsCheckpoint('Sukses')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

