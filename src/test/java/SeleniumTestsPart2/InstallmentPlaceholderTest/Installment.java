package SeleniumTestsPart2.InstallmentPlaceholderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Installment {
    private WebDriver driver;
    private WebDriverWait wait;

    public Installment(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getFieldPlaceholder(By fieldLocator) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLocator));
        return field.getAttribute("placeholder");
    }

    public void selectServiceFromDropdown(String serviceName) {
        By dropdownLocator = By.className("select__header");
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
        dropdown.click();

        By serviceOptionLocator = By.xpath("//p[@class='select__option' and text()='" + serviceName + "']");
        WebElement serviceOption = wait.until(ExpectedConditions.elementToBeClickable(serviceOptionLocator));
        serviceOption.click();
    }

    public void checkPlaceholders() {
        String placeholderScore = getFieldPlaceholder(By.id("score-instalment"));
        String placeholderSum = getFieldPlaceholder(By.id("instalment-sum"));
        String placeholderEmail = getFieldPlaceholder(By.id("instalment-email"));

        if (placeholderScore.equals("Номер счета на 44")) {
            System.out.println("Плейсхолдер для счета корректен");
        } else {
            System.out.println("Плейсхолдер Счет некорректен");
        }

        if (placeholderSum.equals("Сумма")) {
            System.out.println("Плейсхолдер для суммы корректен");
        } else {
            System.out.println("Плейсхолдер Сумма некорректен");
        }

        if (placeholderEmail.equals("E-mail для отправки чека")) {
            System.out.println("Плейсхолдер для E-mail корректен");
        } else {
            System.out.println("Плейсхолдер Email некорректен");
        }
    }
}
