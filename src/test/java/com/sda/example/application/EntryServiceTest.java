package com.sda.example.application;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryServiceTest {

    private final EntryService entryService = new EntryService();

    @Test
    void saveNewEntry_returnNewEntry() {
        // when
        Entry response = entryService.addNewEntry("tile", "content");

        // then
        assertNotNull(response);
        assertEquals(response.getTitle(), "tile");
        assertEquals(response.getDescription(), "content");
        assertTrue(response.getCreatedDate().toEpochMilli() > 0);
    }
}
