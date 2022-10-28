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

Mobile.tap(findTestObject('0_Common_Repo/Button - Add Note or Checklist (Plus)'), 0)

Mobile.tap(findTestObject('0_Common_Repo/Add Checklist Option'), 0)

Mobile.setText(findTestObject('1_Create_Note_Repo/1.2_Checklist/Set Checklist Title'), 'Checklist 1', 0)

Mobile.tap(findTestObject('Object Repository/1_Create_Note_Repo/1.2_Checklist/Button - Add Checklist Item (Plus)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/1_Create_Note_Repo/1.2_Checklist/Add Checklist Item Input Title'), 
    0)

Mobile.setText(findTestObject('1_Create_Note_Repo/1.2_Checklist/Set Checklist Item Description'), 'This is Checklist Item 1', 
    0)

Mobile.tap(findTestObject('1_Create_Note_Repo/1.2_Checklist/Add Checklist Item Button (OK)'), 0)

Mobile.tap(findTestObject('0_Common_Repo/Button - Save or Back'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/1_Create_Note_Repo/1.2_Checklist/Saved Checklist Item Description'), 
    'This is Checklist Item 1')

Mobile.tap(findTestObject('0_Common_Repo/Button - Save or Back'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/1_Create_Note_Repo/1.2_Checklist/Saved Checklist Item Title'), 
    'Checklist 1')

Mobile.closeApplication()

