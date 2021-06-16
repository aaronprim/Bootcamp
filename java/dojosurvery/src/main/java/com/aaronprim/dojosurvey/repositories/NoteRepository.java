package com.aaronprim.dojosurvey.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aaronprim.dojosurvey.models.Note;

public interface NoteRepository extends CrudRepository<Note, Long> {}
