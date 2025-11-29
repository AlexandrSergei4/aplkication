package com.alki.aplkication.room

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

class AndroidNoteDatabaseFactory(private val context: Context) : NoteDatabaseFactory {
    override fun createBuilder(): RoomDatabase.Builder<NoteDatabase> = Room.databaseBuilder(
        context.applicationContext,
        NoteDatabase::class.java,
        "notes.db"
    )
}
