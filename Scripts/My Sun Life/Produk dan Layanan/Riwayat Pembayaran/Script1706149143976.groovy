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

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Beranda  My Sun Life/a_Riwayat Pembayaran'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_A002268521'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_C02057684'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_010215211'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_010080010'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_129207255'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/a_131892851'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/select_6 Bulan Terakhir12 Bulan Terakhir24 _d7c5df'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Informasi Riwayat Pembayaran  My Sun Life/select_6 Bulan Terakhir12 Bulan Terakhir24 _d7c5df'), 
    '24', true)

