package com.garbuziuk.ownerTests;

import com.garbuziuk.ownerTests.config.HugeWebDriverConfig;
import com.garbuziuk.ownerTests.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver = new WebDriverProvider().get();
    private HugeWebDriverConfig config = new HugeWebDriverConfig();

    @Test
    void testGithubTitle() {
        driver.get(config.getBaseUrl());
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.close();
    }
}
