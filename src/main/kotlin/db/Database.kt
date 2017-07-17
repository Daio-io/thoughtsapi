package db

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI


object Database {

    private val connectionString = MongoClientURI(AppConstants.CONNECTION_STRING)
    private val db = MongoClient(connectionString).getDatabase(AppConstants.DATABASE_NAME)
    private val col = db.getCollection("showerthoughts")

    fun getShowerThoughts(): List<String> = col.find().map { it.getString("text") }.toList()

}