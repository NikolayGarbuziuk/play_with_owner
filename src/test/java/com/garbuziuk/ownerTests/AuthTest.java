package com.garbuziuk.ownerTests;

import com.garbuziuk.ownerTests.config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    @Test
    public void testLocalFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("nikolay.garbuziuk");
        assertThat(config.password()).isEqualTo("12345678");
    }

    @Test
    public void testRemoteFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("Nikolay");
        assertThat(config.password()).isEqualTo("qwerty");
    }
}
