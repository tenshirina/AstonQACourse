package SeleniumTestsPart2.CheckLinkRewrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class SeleniumCheckLinkPO {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");

        MTSHomePage homePage = new MTSHomePage(driver);
        homePage.clickDetailsLink();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")) {
            System.out.println("Ссылка верна");
        } else {
            System.out.println("Ошибка! Ссылка ведет на неправильную страницу");
        }

        driver.quit();
    }
}
