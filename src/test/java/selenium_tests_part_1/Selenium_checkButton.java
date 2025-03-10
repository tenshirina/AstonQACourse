package selenium_tests_part_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_checkButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mts.by");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement cookieCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cookie__cancel")));
            cookieCloseButton.click();
        } catch (Exception e) {
            System.out.println("Кнопка cookies не найдена.");
        }

        WebElement block = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));

        WebElement phoneInputField = driver.findElement(By.id("connection-phone"));
        phoneInputField.click();
        phoneInputField.sendKeys("297777777");

        WebElement sumInputField = driver.findElement(By.id("connection-sum"));
        sumInputField.click();
        sumInputField.sendKeys("300");

        WebElement continueButton = driver.findElement(By.cssSelector(".button.button__default"));
        continueButton.click();

        WebDriverWait waitCardPage = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframeElement = waitCardPage.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
        driver.switchTo().frame(iframeElement);

        WebElement cardPage = waitCardPage.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-page__card")));

        if (cardPage.isDisplayed()) {
            System.out.println("Окно оплаты отображается.");
        } else {
            System.out.println("Окно оплаты не отображается.");
        }

        driver.quit();
    }
}
