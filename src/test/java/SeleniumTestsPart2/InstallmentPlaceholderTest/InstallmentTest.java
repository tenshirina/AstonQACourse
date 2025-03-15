package SeleniumTestsPart2.InstallmentPlaceholderTest;

import SeleniumTestsPart2.CommunicationServicesPlaceholderTests.CommunicationServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstallmentTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mts.by");

        CommunicationServices servicePage = new CommunicationServices(driver);

        servicePage.checkPlaceholders();

        servicePage.selectServiceFromDropdown("Рассрочка");

        driver.quit();
    }
}
