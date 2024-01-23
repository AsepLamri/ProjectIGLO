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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Welcome  Online Banking/input_username'), 'asep')

WebUI.setEncryptedText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Welcome  Online Banking/input_password'), 
    'amhbjqpz+W+cUhleMTuzlg==')

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Welcome  Online Banking/input_button'))

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Accounts Overview/a_Bill Pay'))

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.name'), 'Andri')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.street'), '')

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.street'))

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.street'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.street'), 'Pancoran')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.state'), 'Dki Jakarta')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.address.zipCode'), '002')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.phoneNumber_1'), '0912345678')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_payee.accountNumber'), '12345')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_verifyAccount'), '12345')

WebUI.setText(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_amount'), '300000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/select_12345                               _65d9a2'), 
    '12345', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/select_12345                               _65d9a2'), 
    '54321', true)

WebUI.click(findTestObject('Object Repository/Para Bank/Page_ParaBank  Bill Pay/input_button'))

WebUI.takeScreenshotAsCheckpoint('')

