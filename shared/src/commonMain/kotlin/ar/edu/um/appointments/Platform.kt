package ar.edu.um.appointments

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform