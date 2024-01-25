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

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Harga Unit  My Sun Life/a_Informasi Pembayaran'))

WebUI.takeScreenshotAsCheckpoint('Informasi Pembayaran')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/button_Pembayaran PremiKontribusi Pertama'))

WebUI.takeScreenshotAsCheckpoint('Informasi Pembayaran')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Pembayaran Premi Lanjutan'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Pembayaran Premi Investasi Tunggal(Top up)'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Khusus Pembayaran Premi Lanjutan Polis G_72d910'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Khusus Pembayaran Perubahan dan Pemulihan Polis'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Khusus Polis dengan mata uang Dollar'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_TES AGENT'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/a_Penjualan Melalui Bank dan lainnya'))

WebUI.takeScreenshotAsCheckpoint('Informasi Pembayaran')

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Pembayaran Premi Pertama'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Pembayaran Premi Lanjutan'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_Pembayaran Premi Investasi Tunggal(Top U_ffaf63'))

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Informasi Pembayaran  My Sun Life/h4_TES BANKS'))

