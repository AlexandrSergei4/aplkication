package com.alki.aplkication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform