package com.kangdroid.test.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test_function() {

        // Set Reference Variable
        String name = "test";
        int amount = 1000;

        // Set Reference Variable to new object[to be tested]
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // Check whether it works correctly
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
