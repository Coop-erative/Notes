package com.cooper_notes.Notes.data;

import com.cooper_notes.Notes.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.servlet.http.HttpSession;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}