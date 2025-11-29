package com.alki.aplkication

import androidx.compose.ui.window.ComposeUIViewController
import com.alki.aplkication.room.IosNoteDatabaseFactory
import com.alki.aplkication.room.RoomNotesRepository
import com.alki.aplkication.ui.NotesApp

fun MainViewController() = ComposeUIViewController {
    NotesApp(repository = RoomNotesRepository(IosNoteDatabaseFactory()))
}
