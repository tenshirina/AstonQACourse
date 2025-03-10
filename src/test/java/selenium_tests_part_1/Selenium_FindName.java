package selenium_tests_part_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Selenium_FindName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mts.by");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement block = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']")));

        String blockText = block.getText();
        if (blockText.equals("Онлайн пополнение\n" +
                "без комиссии")) {
            System.out.println("Название блока соответсвует: Онлайн пополнение без комиссии");
        } else {
            System.out.println("Название блока неверное");
        }

        driver.quit();
    }
}
