package com.cooper_notes.Notes.models;

public enum NotesEventsType {

    CONFERENCE("Conference"),
    MEETUP("Meetup");

    private final String displayName;

    NotesEventsType(String displayName) {
            this.displayName = displayName;
        }

    public String getDisplayName() {
        return displayName;
    }
}
