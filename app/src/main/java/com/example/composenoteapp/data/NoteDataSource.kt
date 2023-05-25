package com.example.composenoteapp.data

import com.example.composenoteapp.model.Note

class NoteDataSource {
    private val notes = mutableListOf<Note>()

    fun saveNote(note: Note) {
        notes.add(note)
    }

    fun getNotes(): List<Note> = notes

    fun deleteNote(noteId: String): Boolean {
        return notes.removeIf { it.id == noteId }
    }
}
