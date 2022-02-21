package com.catalog.catalogue.repository;

import com.catalog.catalogue.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository <Note, Long> {
    Note findByNoteId(Long noteId);
    List<Note> findNoteByPub( boolean b);
}
