package com.example.composenoteapp.data

import com.example.composenoteapp.model.Note

class NoteRepository(private val noteDataSource: NoteDataSource) {
    fun saveNote(note: Note) = noteDataSource.saveNote(note)
    fun deleteNote(noteId: String) = noteDataSource.deleteNote(noteId)
    fun getNotes() = noteDataSource.getNotes()
}
