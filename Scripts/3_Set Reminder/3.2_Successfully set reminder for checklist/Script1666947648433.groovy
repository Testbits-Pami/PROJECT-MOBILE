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

Mobile.tap(findTestObject('1_Create_Note_Repo/1.2_Checklist/Saved Checklist Item Title', [('noteTitle') : noteTitle]), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Button - 3Dots'), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.1_3Dots/Option - 3Dots Option Select', [('dotsOptionSelect') : dotsOptionSelect]), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/3_Set_Reminder_Repo/Reminder Page Title'), 0)

Mobile.tap(findTestObject('3_Set_Reminder_Repo/Reminder Type Option List'), 0)

Mobile.tap(findTestObject('3_Set_Reminder_Repo/Reminder Type Option List Item Selection', [('reminderType') : reminderType]), 
    0)

Mobile.tap(findTestObject('Object Repository/3_Set_Reminder_Repo/Set Reminder - DONE'), 0)

reminderDate = Mobile.getText(findTestObject('1_Create_Note_Repo/1.2_Checklist/Checklist Description with Pin Reminder'), 
    0)

Mobile.verifyElementExist(findTestObject('1_Create_Note_Repo/1.2_Checklist/Checklist Description with Pin Reminder (Verify)', 
        [('reminderDate') : reminderDate]), 0)

Mobile.tap(findTestObject('0_Common_Repo/Button - Save or Back'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/1_Create_Note_Repo/1.2_Checklist/Checklist Title with Pin Reminder'), 
    0)

Mobile.closeApplication()

