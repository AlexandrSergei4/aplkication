package com.alki.aplkication.room

import androidx.room.RoomDatabase

interface NoteDatabaseFactory {
    fun createBuilder(): RoomDatabase.Builder<NoteDatabase>
}
