package SeleniumTestsPart2.CommunicationServicesPlaceholderTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunicationServicesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mts.by");

        CommunicationServices servicePage = new CommunicationServices(driver);

        servicePage.checkPlaceholders();

        servicePage.selectServiceFromDropdown("Услуги связи");

        driver.quit();
    }
}