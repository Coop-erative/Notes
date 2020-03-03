package com.cooper_notes.Notes.models;

import jdk.jfr.Event;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class NotesEvents extends AbstractEntity {
    //id, category, textNotes

    private String category;

    private String textNotes;

//    private NotesEventsType type;

    public NotesEvents(String category, String textNotes) {
        this.category = category;
        this.textNotes = textNotes;
    }

    public NotesEvents() {}

    //getters and setters

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

    //    //Overrides
    @Override
    public String toString() {
        return category;
    }


}
