package com.catalog.catalogue.controller;


import com.catalog.catalogue.entity.Note;
import com.catalog.catalogue.service.NoteService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteService noteService;

    //add a new note
    @PostMapping("/note")
    public Note saveNote(@RequestBody Note note) {
        return noteService.saveNote(note);
    }

    //update note
    @PutMapping("/note/{id}")
    public Note updateNote (@PathVariable("id") Long noteId, @RequestBody Note noteContent){
        Note note = noteService.getNoteById(noteId);

        note.setTitle(noteContent.getTitle());
        note.setDescription(noteContent.getDescription());
        //edit tag
        Note newEdit = noteService.saveNote(note);
        return  newEdit;
    }

    //get private notes
    @GetMapping("/portfolio")
    public List<Note> getAllPrivateNotes(){
        return noteService.getAllPrivateNotes();

    }

    //get public notes
    @GetMapping("/marketplace")
    public List<Note> getAllPublicNotes(){
        return noteService.getAllPublicNotes();

    }


    //delete note
    @DeleteMapping("/note/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable("id") Long noteId){
        Note note = noteService.getNoteById(noteId);
        noteService.deleteNote(note);
        return ResponseEntity.ok().build();
    }

    //get notes by tag
}
