package com.alki.aplkication.room

import androidx.room.Room
import androidx.room.RoomDatabase

class JvmNoteDatabaseFactory : NoteDatabaseFactory {
    override fun createBuilder(): RoomDatabase.Builder<NoteDatabase> =
        Room.inMemoryDatabaseBuilder<NoteDatabase>()
}
