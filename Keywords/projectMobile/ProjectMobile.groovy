package projectMobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


public class ProjectMobile {
	
	LocalDateTime currentDate = LocalDateTime.now()
	
	@Keyword
	public getCurrentDateFormatted() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd/MM/yyyy')
		String formattedDate = currentDate.format(formatter)
		return formattedDate
	}
	
	@Keyword
	public getCurrentDateDayAndMonth() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd MMM')
		String formattedDayAndMonth = currentDate.format(formatter)
		return formattedDayAndMonth
	}
	
}
