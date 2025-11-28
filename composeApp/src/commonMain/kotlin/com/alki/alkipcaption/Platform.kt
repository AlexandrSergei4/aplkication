package com.alki.alkipcaption

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform