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

Mobile.tap(findTestObject('0_Common_Repo/Button - More Menu (Three Lines Icon)'), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.2_More_Settings/More Settings - Trash Can'), 0)

Mobile.tap(findTestObject('Object Repository/9_Delete_All_Trash_Repo/Button - Delete All Trash'), 0)

Mobile.waitForElementPresent(findTestObject('9_Delete_All_Trash_Repo/Popup - Delete Trash Confirmation Title'), 0)

Mobile.tap(findTestObject('Object Repository/9_Delete_All_Trash_Repo/Popup - Delete Trash Confirmation OK'), 0)

Mobile.tap(findTestObject('0_Common_Repo/0.2_More_Settings/More Settings - Back Icon Nav'), 0)

Mobile.tap(findTestObject('0_Common_Repo/Button - Notes Menu Icon (Notes Icon)'), 0)

Mobile.closeApplication()

