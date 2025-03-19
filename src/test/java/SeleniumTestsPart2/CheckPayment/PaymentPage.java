package SeleniumTestsPart2.CheckPayment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import java.time.Duration;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By phoneInputLocator = By.id("connection-phone");
    private By sumInputLocator = By.id("connection-sum");
    private By continueButtonLocator = By.cssSelector(".button.button__default");
    private By iframeLocator = By.tagName("iframe");
    private By phoneNumberLocator = By.className("pay-description__text");
    private By descriptionCostLocator = By.className("pay-description__cost");
    private By submitButtonLocator = By.xpath("//button[contains(@class, 'colored') and contains(@class, 'disabled')]");
    private By cardNumberInputLocator = By.xpath("//label[contains(text(), 'Номер карты')]");
    private By cardExpirationDateInputLocator = By.xpath("//label[contains(text(), 'Срок действия')]");
    private By cardCVCInputLocator = By.xpath("//label[contains(text(), 'CVC')]");
    private By cardNameImputLocator = By.xpath("//label[contains(text(), 'Имя держателя (как на карте)')]");
    private By paymentIconsLocator = By.cssSelector(".icons-container");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInputLocator));
        phoneInputField.click();
        phoneInputField.sendKeys(phoneNumber);
    }

    public void enterSum(String sum) {
        WebElement sumInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(sumInputLocator));
        sumInputField.click();
        sumInputField.sendKeys(sum);
    }

    public void clickContinueButton() {
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueButtonLocator));
        continueButton.click();
    }

    public void switchToIframe() {
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(iframeLocator));
        driver.switchTo().frame(iframeElement);
    }

    public boolean isDescriptionCostCorrect(String expectedCost) {
        WebElement descriptionCost = wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionCostLocator));
        return descriptionCost.getText().equals(expectedCost);
    }

    public boolean isPhoneNumberCorrect(String expectedPhone) {
        WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberLocator));
        return phoneNumber.getText().equals(expectedPhone);
    }

    public boolean isSubmitButtonTextCorrect(String expectedText) {
        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(submitButtonLocator));
        return submitButton.getText().equals(expectedText.trim());
    }

    public boolean isCardFieldPlaceholderCorrect() {
        WebElement cardNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberInputLocator));
        WebElement expirationDateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cardExpirationDateInputLocator));
        WebElement cardCVCInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cardCVCInputLocator));
        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNameImputLocator));

        return cardNumberInput.getText().equals("Номер карты")
                && expirationDateInput.getText().equals("Срок действия")
                && cardCVCInput.getText().equals("CVC")
                && nameInput.getText().equals("Имя держателя (как на карте)");
    }

    public boolean arePaymentIconsVisible() {
        List<WebElement> paymentIcons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(paymentIconsLocator));
        return !paymentIcons.isEmpty();
    }
}
