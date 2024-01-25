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

WebUI.click(findTestObject('Object Repository/My Sun Life/Page_Riwayat Administrasi  My Sun Life/a_Riwayat Klaim'))

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    'A002268521', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '105228262', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '100261212', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    'C02057684', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '010215211', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '010080010', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '129207255', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/My Sun Life/Page_Riwayat Klaim  My Sun Life/select_A60573511A002268521C0205768401021521_da13ea'), 
    '131892851', true)

