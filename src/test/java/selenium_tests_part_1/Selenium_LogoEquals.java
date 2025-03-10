package selenium_tests_part_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import java.time.Duration;

public class Selenium_LogoEquals {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mts.by");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement block = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));

        List<WebElement> logos = driver.findElements(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]/following-sibling::div//img"));

        if (logos.size() > 0) {
            System.out.println("Найдено " + logos.size() + " логотипов.");
        } else {
            System.out.println("Логотипы не найдены.");
        }

        driver.quit();
    }
}
