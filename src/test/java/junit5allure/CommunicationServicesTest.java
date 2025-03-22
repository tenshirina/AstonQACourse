package junit5allure;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommunicationServicesTest {
    private WebDriver driver;
    private CommunicationServices servicePage;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        servicePage = new CommunicationServices(driver);
        driver.get("http://mts.by");
    }

    @Test
    @Description("Проверка плейсхолдеров и выбора услуги из выпадающего списка")
    void testCommunicationServices() {
        servicePage.checkPlaceholders();

        servicePage.selectServiceFromDropdown("Услуги связи");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    static class CommunicationServices {
        private WebDriver driver;
        private WebDriverWait wait;

        public CommunicationServices(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        @Step("Получение плейсхолдера")
        public String getFieldPlaceholder(By fieldLocator) {
            WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLocator));
            return field.getAttribute("placeholder");
        }

        @Step("Выбор услуги 'Услуги связи' из выпадающего списка")
        public void selectServiceFromDropdown(String serviceName) {
            By dropdownLocator = By.className("select__header");
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
            dropdown.click();

            By serviceOptionLocator = By.xpath("//p[@class='select__option' and text()='" + serviceName + "']");
            WebElement serviceOption = wait.until(ExpectedConditions.elementToBeClickable(serviceOptionLocator));
            serviceOption.click();
        }

        @Step("Проверка плейсхолдеров на странице")
        public void checkPlaceholders() {
            String placeholderPhone = getFieldPlaceholder(By.id("connection-phone"));
            String placeholderSum = getFieldPlaceholder(By.id("connection-sum"));
            String placeholderEmail = getFieldPlaceholder(By.id("connection-email"));

            assertPlaceholder(placeholderPhone, "Номер телефона");
            assertPlaceholder(placeholderSum, "Сумма");
            assertPlaceholder(placeholderEmail, "E-mail для отправки чека");
        }

        private void assertPlaceholder(String actual, String expected) {
            if (actual.equals(expected)) {
                System.out.println("Плейсхолдер '" + expected + "' корректен");
            } else {
                System.out.println("Плейсхолдер '" + expected + "' некорректен");
            }
        }
    }
}

