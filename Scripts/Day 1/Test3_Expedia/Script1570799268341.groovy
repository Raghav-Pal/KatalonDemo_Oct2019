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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.expedia.co.in/')

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/button_Flights                      Tab 1 o_cc1a45'))

WebUI.setText(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/input_Flying from_flight-origin-hp-flight'), 
    'Boston, United States of America (BOS-All Airports)')

WebUI.setText(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/input_Flying to_flight-destination-hp-flight'), 
    'Paris, France (CDG-Roissy-Charles de Gaulle)')

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/input_Departing_starDate'))

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/button_November 12'))

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/input_Returning_endDate'))

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/input_Returning_endDate'))

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/button_November 22'))

WebUI.click(findTestObject('Object Repository/Page_Expedia Travel Vacations Cheap Flights_ddb2a3/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_BOS to CDG Flights  Expedia/a_Home'))

WebUI.closeBrowser()

