package com.sda.example.application;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TimeServiceTest {

    private final TimeService timeService = new TimeService();

    @Test
    void whenGetTime_returnCurrentTime() {
        // when
        Instant time = timeService.getTime();

        // then
        assertNotNull(time);
        assertTrue(time.getEpochSecond() > 0);
    }
}
