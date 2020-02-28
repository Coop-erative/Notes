package com.cooper_notes.Notes.models;

import jdk.jfr.Event;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class NotesEvents {
    //id, category, textNotes
    @Id
    @GeneratedValue
    private int id;

    private String category;

    private String textNotes;

    private NotesEventsType type;

    public NotesEvents(String category, String textNotes, NotesEventsType type) {
        this.category = category;
        this.textNotes = textNotes;
        this.type = type;
    }

    public NotesEvents() {}

    //getters and setters
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTextNotes() {
        return textNotes;
    }

    public void setTextNotes(String textNotes) {
        this.textNotes = textNotes;
    }

    public NotesEventsType getType() {
        return type;
    }

    public void setType(NotesEventsType type) {
        this.type = type;
    }

//    //Overrides
    @Override
    public String toString() {
        return category;
    }
//TODO: equals override problem
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
