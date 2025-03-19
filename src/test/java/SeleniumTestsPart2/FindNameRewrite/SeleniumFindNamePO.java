package SeleniumTestsPart2.FindNameRewrite;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFindNamePO {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mts.by");
        HomePage homePage = new HomePage(driver);

        String blockText = homePage.getBlockText();
        if (blockText.equals("Онлайн пополнение\nбез комиссии")) {
            System.out.println("Название блока соответствует: Онлайн пополнение без комиссии");
        } else {
            System.out.println("Название блока неверное");
        }

        driver.quit();
    }
}

