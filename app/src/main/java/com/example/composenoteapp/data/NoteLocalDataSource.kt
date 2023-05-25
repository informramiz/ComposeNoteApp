package com.example.composenoteapp.data

import com.example.composenoteapp.model.Note
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class NoteLocalDataSource @Inject constructor(
    private val notes: MutableList<Note> = mutableListOf()
) {

    fun saveNote(note: Note) {
        notes.add(note)
    }

    fun getNotes(): Flow<List<Note>> = flowOf(notes)

    fun deleteNote(noteId: String): Boolean {
        return notes.removeIf { it.id == noteId }
    }
}
