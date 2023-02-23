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

WebUI.delay(2)

WebUI.setText(findTestObject('Data Pemesan/input_NIK'), GlobalVariable.nik)

WebUI.setText(findTestObject('Data Pemesan/input_Nama Lengkap'), GlobalVariable.name)

WebUI.setText(findTestObject('Data Pemesan/input_Alamat Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Data Pemesan/input_No Telp'), GlobalVariable.phone)

WebUI.setText(findTestObject('Data Pemesan/input_KotaNegara'), GlobalVariable.country)

WebUI.setText(findTestObject('Data Pemesan/input_Tanggal Lahir'), GlobalVariable.birth)

WebUI.delay(2)

WebUI.click(findTestObject('Data Pemesan/checkedList_Saya sudah memastikan semua data yang diinputkan sesuai'))

WebUI.click(findTestObject('Data Pemesan/button_LANJUT'))

