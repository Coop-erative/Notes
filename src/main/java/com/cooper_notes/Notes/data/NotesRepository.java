package com.cooper_notes.Notes.data;

import com.cooper_notes.Notes.models.NotesEvents;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface NotesRepository extends CrudRepository<NotesEvents, Integer> {
}
