package com.sda.example.application;

import java.util.List;

public class EntryController {

    private final EntryService entryService = new EntryService();

    public String addNewEntry(String title, String content) {
        Entry entry = entryService.addNewEntry(title, content);
        return entry.toString();
    }

    public String readAllEntries() {
        List<Entry> entries = entryService.readAllEntries();
        return entries.toString();
    }
}
