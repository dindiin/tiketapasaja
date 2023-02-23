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

WebUI.click(findTestObject('Metode Pembayaran/a_DebitCredit Card'))

WebUI.click(findTestObject('Metode Pembayaran/label_CREDITDEBIT CARD'))

WebUI.click(findTestObject('Metode Pembayaran/buttonDiv_LANJUT'))

WebUI.setText(findTestObject('Metode Pembayaran/Debit or Credit Card/input_Card Number'), GlobalVariable.cardNumber)

WebUI.setText(findTestObject('Metode Pembayaran/Debit or Credit Card/input_Expiration'), GlobalVariable.expiredCard)

WebUI.setText(findTestObject('Metode Pembayaran/Debit or Credit Card/input_Security Code'), GlobalVariable.cvv)

WebUI.click(findTestObject('Metode Pembayaran/Debit or Credit Card/button_PROSES'))

