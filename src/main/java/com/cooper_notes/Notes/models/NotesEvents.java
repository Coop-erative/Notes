package com.cooper_notes.Notes.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class NotesEvents {
//Declare variables with validation
    @Id
    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Category Required")
    @Size(min=3, max=50, message = "Name must be between 3 and 50 characters")
    private String category;

    private NotesEventsType type;

    public NotesEvents(String category, NotesEventsType type) {

    }



}
