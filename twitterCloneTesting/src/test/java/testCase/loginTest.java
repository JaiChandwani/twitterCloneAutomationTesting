package testCase;

import base.baseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends baseTest {
    @Test
    public void invalidUserName() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("userNameLoginInputField"))).sendKeys(data.getProperty("UserName")+"test");
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys(data.getProperty("password"));
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageLoginPage"))).isDisplayed());
    }
    @Test
    public void blankUserName() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys(data.getProperty("password"));
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageLoginPageEmptyField"))).isDisplayed());
    }
    @Test
    public void incorrectPassword() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("userNameLoginInputField"))).sendKeys(data.getProperty("UserName"));
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys(data.getProperty("password")+"test");
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageLoginPage"))).isDisplayed());
    }
    @Test
    public void blankPassword() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("userNameLoginInputField"))).sendKeys(data.getProperty("UserName"));
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageLoginPageEmptyField"))).isDisplayed());
    }
    @Test
    public void blankUserNameAndPassword() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("errorMessageLoginPageEmptyField"))).isDisplayed());
    }
    @Test
    public void sucessfulLogin() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("userNameLoginInputField"))).sendKeys(data.getProperty("UserName"));
        driver.findElement(By.xpath(loc.getProperty("passwordInputField"))).sendKeys(data.getProperty("password"));
        driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath(loc.getProperty("loginSucessfulAssert"))).isDisplayed());
    }
}
