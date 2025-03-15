package SeleniumTestsPart2.DeptPlaceholderTest;

import SeleniumTestsPart2.CommunicationServicesPlaceholderTests.CommunicationServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeptTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mts.by");

        CommunicationServices servicePage = new CommunicationServices(driver);

        servicePage.checkPlaceholders();

        servicePage.selectServiceFromDropdown("Задолженность");

        driver.quit();
    }
}
