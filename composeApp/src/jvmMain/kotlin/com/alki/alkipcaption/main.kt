package com.alki.alkipcaption

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "alkipcaption",
    ) {
        App()
    }
}