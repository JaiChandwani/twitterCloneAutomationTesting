package testCase;

import base.baseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signUpTest extends baseTest {
    @Test
    public void doesNotAccpetOnlyEmail() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        driver.findElement(By.xpath(loc.getProperty("emailInputField"))).sendKeys("AutomationTest@test.com");
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageSignUpPage"))).isDisplayed());
    }
    @Test
    public void doesNotAccpetOnlyUserName() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        driver.findElement(By.xpath(loc.getProperty("userNameSignupInputField"))).sendKeys("Autmation Tester");
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageSignUpPage"))).isDisplayed());
    }
    @Test
    public void doesNotAccpetOnlyFullName() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        driver.findElement(By.xpath(loc.getProperty("fullNameInputField"))).sendKeys("Automation Tester");
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageSignUpPage"))).isDisplayed());
    }
    @Test
    public void doesNotAccpetOnlyPassword() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys("123456789");
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageSignUpPage"))).isDisplayed());
    }
    @Test
    public void checkingIfUserCanCreateSameAccountAnotherTime() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        driver.findElement(By.xpath(loc.getProperty("emailInputField"))).sendKeys("AutomationTest@test.com");
        driver.findElement(By.xpath(loc.getProperty("userNameSignupInputField"))).sendKeys("Autmation Tester");
        driver.findElement(By.xpath(loc.getProperty("fullNameInputField"))).sendKeys("Automation Tester");
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys("123456789");
        driver.findElement(By.xpath(loc.getProperty("signupBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageSignUpPage"))).isDisplayed());
    }
}
