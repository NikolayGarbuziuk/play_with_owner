package com.garbuziuk.ownerTests.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider() {
        Object WebDriverConfig;
        config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Override
    public WebDriver get() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\MyIdeaProjects\\play_with_owner\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.isNull(config.getRemoteUrl())) {
            if (config.getBrowser().equals(Browser.FIREFOX)) {
                return new FirefoxDriver();
            }
            if (config.getBrowser().equals(Browser.CHROME)) {
                return new ChromeDriver();
            }
        } else {
            return new RemoteWebDriver(config.getRemoteUrl(), DesiredCapabilities.firefox());
        }
        throw new NullPointerException("No such browser");

    }
}
