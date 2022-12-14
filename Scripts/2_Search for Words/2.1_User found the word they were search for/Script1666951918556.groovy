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

Mobile.waitForElementPresent(findTestObject('0_Common_Repo/Button - Search Menu Icon (Magnify Glass Icon)'), 3)

Mobile.tap(findTestObject('Object Repository/0_Common_Repo/Button - Search Menu Icon (Magnify Glass Icon)'), 0)

if (Mobile.verifyElementExist(findTestObject('2_Search_for_Words_Repo/Clear Search Text - X'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('2_Search_for_Words_Repo/Clear Search Text - X'), 0)
}

Mobile.setText(findTestObject('Object Repository/2_Search_for_Words_Repo/Set Text Search Words Input'), searchWord, 0)

Mobile.verifyElementExist(findTestObject('2_Search_for_Words_Repo/Search Result Text Note 1 Title', [('searchWord') : searchWord]), 
    0)

Mobile.tap(findTestObject('2_Search_for_Words_Repo/Search Result Text Note 1 Title', [('searchWord') : searchWord]), 0)

Mobile.verifyElementExist(findTestObject('2_Search_for_Words_Repo/Search Result Text Note 1 Description', [('searchWord') : searchWord]), 
    0)

Mobile.tap(findTestObject('0_Common_Repo/Button - Save or Back'), 0)

Mobile.tap(findTestObject('Object Repository/0_Common_Repo/Button - Notes Menu Icon (Notes Icon)'), 0)

Mobile.closeApplication()

