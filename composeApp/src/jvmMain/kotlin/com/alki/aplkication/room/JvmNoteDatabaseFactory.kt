package com.alki.aplkication.room

import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.File

class JvmNoteDatabaseFactory : NoteDatabaseFactory {
    override fun createBuilder(): RoomDatabase.Builder<NoteDatabase>{
        val dbFile = File(System.getProperty("java.io.tmpdir"), "aplkication.db")
        return Room.databaseBuilder<NoteDatabase>(
            name = dbFile.absolutePath,
        )
    }
}
