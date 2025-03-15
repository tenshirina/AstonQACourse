package SeleniumTestsPart2.CheckPayment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckPaymentTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PaymentPage paymentPage = new PaymentPage(driver);

        driver.get("https://mts.by");

        WebElement cookieCloseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cookie__cancel")));
        cookieCloseButton.click();

        paymentPage.enterPhoneNumber("297777777");
        paymentPage.enterSum("300");
        paymentPage.clickContinueButton();

        paymentPage.switchToIframe();

        if (paymentPage.isDescriptionCostCorrect("300.00 BYN")) {
            System.out.println("Сумма в описании отображается корректно");
        } else {
            System.out.println("Сумма в описании отображается некорректно");
        }

        if (paymentPage.isSubmitButtonTextCorrect(" Оплатить 300.00 BYN ")) {
            System.out.println("Кнопка подтверждения отображает верную сумму");
        } else {
            System.out.println("Кнопка подтверждения отображает неверную сумму");
        }

        if (paymentPage.isPhoneNumberCorrect("Оплата: Услуги связи Номер:375297777777")) {
            System.out.println("Номер телефона введен правильно.");
        } else {
            System.out.println("Номер телефона введен неверно.");
        }

        if (paymentPage.isCardFieldPlaceholderCorrect()) {
            System.out.println("Плейсхолдеры в полях для ввода реквизитов карты отображаются корректно.");
        } else {
            System.out.println("Плейсхолдеры в полях для ввода реквизитов карты отображаются некорректно.");
        }

        if (paymentPage.arePaymentIconsVisible()) {
            System.out.println("Иконки платёжных систем отображаются.");
        } else {
            System.out.println("Иконки платёжных систем не отображаются.");
        }

        driver.quit();
    }
}

