package junit5allure;

import io.qameta.allure.Step;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

public class FindNameTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Получение блока текста")
    public String getBlockText(By blockLocator) {
        WebElement block = wait.until(ExpectedConditions.presenceOfElementLocated(blockLocator));
        return block.getText();
    }

    @Test
    public void testGetBlockText() {
        driver.get("https://mts.by");

        By blockLocator = By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']");
        String blockText = getBlockText(blockLocator);

        attachScreenshot(driver);

        assertEquals("Онлайн пополнение\nбез комиссии", blockText, "Текст блока не соответствует ожидаемому");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

