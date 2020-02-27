package com.cooper_notes.Notes.data;


import com.coopsNotes.Notes.models.NotesEvents;
import jdk.jfr.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NotesData {
    private static final Map<Integer, Event> events = new HashMap<>();

//    public static Collection<Event> getAll() {
//        return NotesEvents.values();
//    }
//
//    public static NotesEvents getById(int id) {
//        return NotesEvents.get(id);
//    }
//
//    public static void add(Event event) {
//        NotesEvents.put(event.getId(), NotesEvents);
//    }
//
//    public static void remove(int id) {
//        NotesEvents.remove(id);
//    }


//    @Id
//    @GeneratedValue
//    private int id;
//
//    @NotBlank(message = "Name is required")
//    @Size(min =3, max = 50, message = "Name must be between 3 and 50 characters")
//    private String name;
//
//    @Size(max = 500, message = "Description too long!")
//    private String description;
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Invalid Email. Try again.")
//    private String contactEmail;
//
//    public Event(String name, String description, String contactEmail) {
//        this.name = name;
//        this.description = description;
//        this.contactEmail = contactEmail;
//    }
//
//    public Event() {}
//
//    //getters and setters TODO: add these once finalized
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getContactEmail() {
//        return contactEmail;
//    }
//
//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }
//
//
//
//    //Overrides
//    @Override
//    public String toString() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

}
