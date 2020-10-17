package com.sda.example.application;

import java.time.Instant;
import java.util.List;

public class EntryService {

    private final EntryRepository entryRepository = new EntryRepository();
    private final TimeService timeService = new TimeService();

    public Entry addNewEntry(String title, String content) {
        if (title == null || title.isEmpty()) {
            throw new RuntimeException("Tytuł nie może być pusty!");
        }
        if (content == null || content.isEmpty()) {
            throw new RuntimeException("Zawartość nie może być pusta!");
        }

        Instant time = timeService.getTime();

        Entry entry = new Entry(title, content, time);
        Entry savedEntry = entryRepository.saveNewEntry(entry);

        return savedEntry;
    }

    public List<Entry> readAllEntries() {
        return entryRepository.readAllEntries();
    }
}
