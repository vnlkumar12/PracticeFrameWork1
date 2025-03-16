package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
@Component
public class utilityFunctions {
@Autowired
    public static WebDriver driver;

    public void browserInitiation() {
        driver = new ChromeDriver();
    }

    public void browserTearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void launchAndMaximize(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static WebElement waitForElementToBeVisible(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementToBeClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement scrollToElement(By locator, int timeout) {
        WebElement element = waitForElementToBeVisible(locator, timeout);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }
}
