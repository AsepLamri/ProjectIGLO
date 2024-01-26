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

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/span_Master Question'))

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/button_Tambah                              _531150'))

WebUI.click(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/span_-- Choose Level --'))

WebUI.setText(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), 'Level 2')

WebUI.sendKeys(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/span_-- Choose Module --'))

WebUI.setText(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), 'MDL 1')

WebUI.sendKeys(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/span_-- Choose Chapter --'))

WebUI.setText(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), 'CPT 1')

WebUI.sendKeys(findTestObject('E-Learning/Page_Master Quiz  Elearning CMS/input_Save_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/textarea_Question_desc'), 'Pengujian API Dengan Katalon\nJalur pembelajaran ini ditujukan untuk penguji manual, pemula otomatisasi, dan siapa saja yang ingin menjelajahi Platform Katalon untuk pengujian API.\n\nAnda akan mempelajari cara menggunakan solusi kode rendah Katalon untuk membuat permintaan API dengan cepat dan menggabungkannya ke dalam kasus pengujian otomatis untuk pengujian REST dan SOAP API. Kemudian, Anda akan terus mempelajari cara menerapkan teknik yang lebih')

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/textarea_Option A_optA'), 'katalonc -noSplash -runMode=console -projectPath="C:\\Users\\0767\\Katalon Studio\\ProjectIGLO\\ProjectIGLO.prj" -maxFailedTests=3 -retry=0 -testSuitePath="Test Suites/Test Suites/Appointment" -browserType="Chrome" -executionProfile="default" -apiKey="30a646a5-6c14-41df-9a8e-71bbd381ccf6" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true')

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/textarea_Option B_optB'), 'Di akhir jalur pembelajaran ini, Anda akan dapat menggunakan Katalon untuk mengotomatiskan proyek pengujian UI web Anda.')

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/textarea_Option D_optD'), 'Anda akan mempelajari cara menyiapkan Katalon dengan cepat dan menggunakan berbagai teknik serta solusi kode rendah untuk membuat, mengatur, mengelola, menjalankan pengujian otomatis di lingkungan berbeda, dan mengelola laporan dalam satu platform.')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/input_A_correctAnswer'))

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/input_Please choose one_isActive'))

WebUI.setText(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/textarea_Option C_optC'), 'Jalur pembelajaran ini ditujukan untuk penguji manual, pemula otomatisasi, dan siapa saja yang ingin menjelajahi Platform Katalon untuk pengujian UI Web.')

WebUI.takeScreenshotAsCheckpoint('Quiz')

WebUI.click(findTestObject('Object Repository/E-Learning/Page_Master Quiz  Elearning CMS/button_Save'))

WebUI.takeScreenshotAsCheckpoint('Quiz')

WebUI.refresh()

