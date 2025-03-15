package SeleniumTestsPart2.CheckLinkRewrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class MTSHomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение')]")
    private WebElement onlineTopUpBlock;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement detailsLink;

    public MTSHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickDetailsLink() {
        wait.until(ExpectedConditions.visibilityOf(detailsLink));
        detailsLink.click();
    }
}

