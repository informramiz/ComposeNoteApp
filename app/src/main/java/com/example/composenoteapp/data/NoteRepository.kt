package com.example.composenoteapp.data

import com.example.composenoteapp.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteLocalDataSource: NoteLocalDataSource) {
    fun saveNote(note: Note) = noteLocalDataSource.saveNote(note)
    fun deleteNote(noteId: String) = noteLocalDataSource.deleteNote(noteId)
    fun getNotes() = noteLocalDataSource.getNotes()
}
