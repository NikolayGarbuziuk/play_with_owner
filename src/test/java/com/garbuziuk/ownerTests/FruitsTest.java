package com.garbuziuk.ownerTests;

import com.garbuziuk.ownerTests.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testArray() {
        System.setProperty("array", "orange,banana,apple");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray()).
                contains("orange", "apple", "banana");
    }

    @Test
    public void testList() {
        System.setProperty("list", "orange,apple,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList()).
                contains("orange", "apple", "banana");
    }

    @Test
    public void testListWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithDefault()).
                contains("orange", "apple");
    }

    @Test
    public void testListWithSeparator() {
        System.setProperty("list-with-separator", "orange;apple;banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithSeparator()).
                contains("orange", "apple", "banana");
    }

}
