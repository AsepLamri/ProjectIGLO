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

/*
* create a funcion named login which receives 2 parameters: username and password:
* enter username in input_username texbox on Page_home
* enter password in input_password texbox
* Click input_login_button
/*

/*
 * open browser, go to https://www.demo.com/
 * Call a predefiend function 'Login' with username="standar_user", password="secret"
 * Click on link_inventory on Page_home
 * Clik on input_Logout_button
 * Verify if the current page URL is "https://www.demo.com"
 * Verify if the input_username element exists on Page_home, wait for the element to load for 20 second, fail the test case if the element does not exist
 */
// Open browser and go to https://www.demo.com/
WebUI.openBrowser('https://www.demo.com/')

// Call a predefined function 'Login' with username="standar_user", password="secret"
Login('standar_user', 'secret')

// Click on link_inventory on Page_home
WebUI.click(findTestObject('Page_home/link_inventory'))

// Click on input_Logout_button
WebUI.click(findTestObject('Page_home/input_Logout_button'))

// Verify if the current page URL is "https://www.demo.com"
WebUI.verifyUrl('https://www.demo.com')

// Verify if the input_username element exists on Page_home, wait for the element to load for 20 seconds, fail the test case if the element does not exist
WebUI.waitForElementPresent(findTestObject('Page_home/input_username'), 20)

// capture full page screenshot as "successful_logout"
/*
 *  Capture Full Page Screenshot
 *
 *  @param screenshotName The name of the screenshot file
 */
WebUI.takeFullPageScreenshot('successful_logout')

def login(String username, String password) {
    WebUI.setText(findTestObject('Page_home/input_username'), username)

    WebUI.setText(findTestObject('Page_home/input_password'), password)

    WebUI.click(findTestObject('Page_home/input_login_button'))
}

