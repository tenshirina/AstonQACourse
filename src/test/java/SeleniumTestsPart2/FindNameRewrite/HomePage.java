package SeleniumTestsPart2.FindNameRewrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By blockLocator = By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getBlockText() {
        WebElement block = wait.until(ExpectedConditions.presenceOfElementLocated(blockLocator));
        return block.getText();
    }
}
