
object AppConstants {
    const val JSON_CONTENT = "application/json"
    const val HTTP_CACHE_SIZE: Long = 20 * 1024 * 1024
    val APP_CACHE by lazy { System.getenv("CACHE") ?: "max-age=3600" }
    val PORT by lazy { System.getenv("PORT")?.toIntOrNull() ?: 3000 }
    val DATABASE_NAME by lazy { System.getenv("DB_NAME") ?: "showerthoughts" }
    val CONNECTION_STRING by lazy { System.getenv("DB_CONNECTION") ?: "mongodb://localhost:27017" }
}