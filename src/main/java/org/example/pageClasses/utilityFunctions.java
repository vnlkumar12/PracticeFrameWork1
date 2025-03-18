package org.example.pageClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class utilityFunctions {
    @Autowired
    public static WebDriver driver;

    public void browserInitiation(String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;

        }

    }

    public void browserTearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void browserResolution(String device){
        switch (device){
            case "mobile":
                driver.manage().window().setSize(new Dimension(414, 896));
                break;
            case "tablet":
                driver.manage().window().setSize(new Dimension(768, 1024));
                break;
            case "desktop":
                driver.manage().window().maximize();
                break;
        }
    }

    public void launchAndMaximize(String url, String device) {
        driver.get(url);
        browserResolution(device);
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
