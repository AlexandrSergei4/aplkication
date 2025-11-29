package com.alki.aplkication.room

import androidx.room.Room
import androidx.room.RoomDatabase

class IosNoteDatabaseFactory : NoteDatabaseFactory {
    override fun createBuilder(): RoomDatabase.Builder<NoteDatabase> =
        Room.inMemoryDatabaseBuilder<NoteDatabase>()
}
