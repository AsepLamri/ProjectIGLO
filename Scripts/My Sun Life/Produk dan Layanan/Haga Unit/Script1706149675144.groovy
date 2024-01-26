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

WebUI.click(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/a_Harga Unit'))

WebUI.click(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/button_Download Kinerja Investasi'))

WebUI.click(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/input_Periode_periode'))

WebUI.selectOptionByValue(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/select_Tahun20232022202120202019201820172016'), 
    '2023', true)

WebUI.selectOptionByValue(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/select_BulanJanuariFebruariMaretAprilMeiJun_f02c42'), 
    '11', true)

WebUI.click(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/button_Download'))

WebUI.click(findTestObject('My Sun Life/Page_Harga Unit  My Sun Life/button_Tutup'))

