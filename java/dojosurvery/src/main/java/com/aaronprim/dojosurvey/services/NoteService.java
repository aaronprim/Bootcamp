package com.aaronprim.dojosurvey.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.aaronprim.dojosurvey.models.Note;
import com.aaronprim.dojosurvey.repositories.NoteRepository;

@Service
public class NoteService {
	
	private NoteRepository noteRepo;
	
	public NoteService(NoteRepository noteRepo) {
		this.noteRepo = noteRepo;
	}
	
	public ArrayList<Note> getAll() {
		return (ArrayList<Note>) noteRepo.findAll();
	}
	
	public Note create(Note newNote) {
		return noteRepo.save(newNote);
	}
}
