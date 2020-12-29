package com.jbhifitech.writeme.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun addNote(note : Note)
    @Query("SELECT * FROM note")
    fun getallNotes() : List<Note>

    @Insert
    fun addMultipleNote(vararg note : Note)
}