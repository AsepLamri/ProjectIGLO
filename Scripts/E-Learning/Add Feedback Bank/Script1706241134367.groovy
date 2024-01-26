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

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master User Elearning  Elearning CMS/span_Feedback Bank'))

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/button_Tambah                              _c47226'))

WebUI.click(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/span_-- Choose Level --'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/input_Save_select2-search__field'), 'ISO')

WebUI.sendKeys(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/input_Save_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/span_-- Choose Module --'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/input_Save_select2-search__field'), 'ISO 9001')

WebUI.sendKeys(findTestObject('E-Learning/Page_Feedback Bank  Elearning CMS/input_Save_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/input_Title_title'), 'Test')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/input_Title_isActive'))

WebUI.takeScreenshotAsCheckpoint('bank')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Feedback Bank  Elearning CMS/button_Save'))

WebUI.takeScreenshotAsCheckpoint('bank')

WebUI.refresh()

