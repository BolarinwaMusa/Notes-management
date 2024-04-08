package service;

import data.model.Entry;

import java.util.List;

public interface EntryService {
    void save(Entry entry);
    void deleteEntry(String id);
    Entry  getEntry(String id);

    List<Entry> getEntriesFor(String username);
}
