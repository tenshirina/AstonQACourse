package selenium_tests_part_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_CheckLink {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mts.by");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement block = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));

        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();

        WebDriverWait waitLink = new WebDriverWait(driver, Duration.ofSeconds(10));

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.equals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")) {
            System.out.println("Ссылка верна");
        } else {
            System.out.println("Ошибка! Ссылка ведет на неправильную страницу");
        }

        driver.quit();
    }
}
