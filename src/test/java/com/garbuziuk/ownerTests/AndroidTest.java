package com.garbuziuk.ownerTests;

import com.garbuziuk.ownerTests.config.AndroidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AndroidTest {

    @Test
    public void testConfig() {
        AndroidConfig config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
    }

}
