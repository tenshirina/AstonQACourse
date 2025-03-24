package junit5allure;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckLinkTest {
    private WebDriver driver;
    private MTSHomePage mtsHomePage;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mtsHomePage = new MTSHomePage(driver);
    }

    @Test
    @Description("Проверка перехода по ссылке 'Подробнее о сервисе'")
    void checkLinkRewrite() {
        driver.get("https://www.mts.by");

        mtsHomePage.clickDetailsLink();

        waitForPageToLoad();

        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", currentUrl,
                "Ошибка! Ссылка ведет на неправильную страницу");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Step("Ожидание загрузки страницы")
    private void waitForPageToLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    static class MTSHomePage {
        private WebDriver driver;
        private WebDriverWait wait;

        @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение')]")
        private WebElement onlineTopUpBlock;

        @FindBy(linkText = "Подробнее о сервисе")
        private WebElement detailsLink;

        public MTSHomePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            PageFactory.initElements(driver, this);
        }

        @Step("Клик по ссылке 'Подробнее о сервисе'")
        public void clickDetailsLink() {
            wait.until(ExpectedConditions.visibilityOf(detailsLink));
            detailsLink.click();
        }
    }
}

