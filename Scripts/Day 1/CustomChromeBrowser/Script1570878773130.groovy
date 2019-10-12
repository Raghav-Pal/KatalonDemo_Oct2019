import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty("webdriver.chrome.driver", "E:/Desktop/Tools/DownloadedTools/chromedriver_win32/chromedriver.exe")

WebDriver driver = new ChromeDriver()

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://google.com')