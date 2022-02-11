package com.garbuziuk.ownerTests.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:pixel.properties")
public interface AndroidConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

}
