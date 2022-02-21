package com.catalog.catalogue.service;

import com.catalog.catalogue.entity.Note;
import com.catalog.catalogue.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;


    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public Note getNoteById(Long noteId) {
        return noteRepository.findByNoteId(noteId);
    }

    public List<Note> getAllPrivateNotes() {
        return noteRepository.findNoteByPub(false);
    }


    public List<Note> getAllPublicNotes() {
        return noteRepository.findNoteByPub(true);
    }

    public void deleteNote(Note note) {
         noteRepository.delete(note);
    }
}
