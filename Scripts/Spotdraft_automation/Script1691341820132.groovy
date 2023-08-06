import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Test Data
def username = 'shayam2412@gmail.com'

def password = 'Welcome@123'

def bookTitle = 'It ends with us'

// Open browser and navigate to Goodreads
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.goodreads.com/')

//login
WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/sign_in'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/signin_button'))

WebUI.sendKeys(findTestObject('Good_reads_Spotdraft_assesment/email'), username)

WebUI.sendKeys(findTestObject('Good_reads_Spotdraft_assesment/password'), password)

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/Submit_button'))

//Search for a book
WebUI.sendKeys(findTestObject('Good_reads_Spotdraft_assesment/input_search'), bookTitle)

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/Result'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/button_want to read'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/button_want to read'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/remove from shelf'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/button_remove'))

WebUI.waitForPageLoad(0)

//Log out
WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/profile_icon'))

WebUI.click(findTestObject('Good_reads_Spotdraft_assesment/Log_out'))

// Close the browser
WebUI.closeBrowser()

