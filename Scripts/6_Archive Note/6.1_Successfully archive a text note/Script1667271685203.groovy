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

Mobile.startExistingApplication(GlobalVariable.appId)

Mobile.waitForElementPresent(findTestObject('6_Archive_Note/Selected Note to be Archived', [('selectedNote') : selectedNote]), 
    0)

Mobile.tap(findTestObject('6_Archive_Note/Selected Note to be Archived', [('selectedNote') : selectedNote]), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Button - 3Dots'), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Option - 3Dots Option Select', [('dotsOptionSelect') : dotsOptionSelect]), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/6_Archive_Note/Popup - Archive Confirmation Title'), 0)

Mobile.tap(findTestObject('Object Repository/6_Archive_Note/Popup - Archive Confirmation OK'), 0)

Mobile.tap(findTestObject('0_Common_Repo/Button - More Menu (Three Lines Icon)'), 0)

Mobile.tap(findTestObject('Object Repository/0_Common_Repo/0.2_More_Settings/More Settings - Archive'), 0)

Mobile.verifyElementText(findTestObject('6_Archive_Note/Selected Note to be Archived', [('selectedNote') : selectedNote]), 
    selectedNote)

Mobile.tap(findTestObject('0_Common_Repo/0.2_More_Settings/More Settings - Back Icon Nav'), 0)

Mobile.tap(findTestObject('0_Common_Repo/Button - Notes Menu Icon (Notes Icon)'), 0)

Mobile.verifyElementNotExist(findTestObject('6_Archive_Note/Selected Note to be Archived', [('selectedNote') : selectedNote]), 
    3)

Mobile.closeApplication()

