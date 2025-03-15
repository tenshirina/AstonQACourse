package SeleniumTestsPart2.HomeInternetPlaceholderTest;

import SeleniumTestsPart2.CommunicationServicesPlaceholderTests.CommunicationServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeInternetTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mts.by");

        CommunicationServices servicePage = new CommunicationServices(driver);

        servicePage.checkPlaceholders();

        servicePage.selectServiceFromDropdown("Домашний интернет");

        driver.quit();
    }
}
