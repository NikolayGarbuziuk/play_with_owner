package com.garbuziuk.ownerTests;

import com.garbuziuk.ownerTests.config.IOSConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSTest {

    @Test
    public void testConfig() {
        IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11.0");
        assertThat(config.deviceName()).isEqualTo("Iphone 13 Pro Max XL Boost Must Have");
    }

}
