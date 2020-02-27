package com.cooper_notes.Notes.data;



import jdk.jfr.Event;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface NotesRepository extends CrudRepository<Event, Integer> {
}
