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

Mobile.waitForElementPresent(findTestObject('1_Create_Note_Repo/1.1_Text Note/Saved Text Note Title', [('noteTitle') : noteTitle]), 
    3)

Mobile.tap(findTestObject('1_Create_Note_Repo/1.1_Text Note/Saved Text Note Title', [('noteTitle') : noteTitle]), 0)

Mobile.tap(findTestObject('Object Repository/0_Common_Repo/Button - Edit (Pencil Icon)'), 0)

Mobile.setText(findTestObject('4_Edit_the_Note_Repo/Edited Text Note', [('editedText') : editedText]), editedText, 0)

Mobile.verifyElementText(findTestObject('4_Edit_the_Note_Repo/Edited Text Note', [('editedText') : editedText]), editedText)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Button - 3Dots'), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Option - 3Dots Option Select', [('dotsOptionSelect') : dotsOptionSelect]), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/4_Edit_the_Note_Repo/Popup - Revert Confirmation Title'), 
    0)

Mobile.tap(findTestObject('Object Repository/4_Edit_the_Note_Repo/Popup Button - Revert Confirmation OK'), 0)

Mobile.verifyElementText(findTestObject('4_Edit_the_Note_Repo/Reverted Text Note', [('revertText') : revertText]), revertText)

Mobile.tap(findTestObject('0_Common_Repo/Button - Save or Back'), 0)

Mobile.closeApplication()

