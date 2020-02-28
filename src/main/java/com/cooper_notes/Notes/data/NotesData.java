package com.cooper_notes.Notes.data;


import com.cooper_notes.Notes.models.NotesEvents;
import jdk.jfr.Event;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NotesData {
    private static final Map<Integer, NotesEvents> events = new HashMap<>();

     public static Collection<NotesEvents> getAll() {
         return events.values();
     }

    public static NotesEvents getById(int id) {
        return events.get(id);
    }

    public static void add(NotesEvents event) {
        events.put(event.getId(), event);
    }

    public static void remove(int id) {
        events.remove(id);
    }




}
