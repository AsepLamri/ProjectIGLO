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

WebUI.callTestCase(findTestCase('My Sun Life/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Daftar Rumah Sakit  My Sun Life/a_Download File'))

WebUI.takeScreenshotAsCheckpoint('Download')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Download File  My Sun Life/html_Download File  My Sun Life.swal2-popup_a8b94f'))

WebUI.setText(findTestObject('Object Repository/My Sun Life/Page_Download File  My Sun Life/input_Download File_search'), 
    'pengalihan premi')

WebUI.takeScreenshotAsCheckpoint('Download')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Download File  My Sun Life/img'))

WebUI.switchToWindowTitle('Download File | My Sun Life')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Download File  My Sun Life/img_Formulir Pengalihan Premi_ms-1'))

