package db

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI


object Database {

    private val connectionString = MongoClientURI(AppConstants.CONNECTION_STRING)
    private val db = MongoClient(connectionString).getDatabase(AppConstants.DATABASE_NAME)
    private val showerCollection = db.getCollection("showerthoughts")
    private val tilsCollection = db.getCollection("tils")

    fun getShowerThoughts(): List<String> = showerCollection.find().map { it.getString("text") }.toList()
    fun getTils(): List<String> = tilsCollection.find().map { it.getString("text") }.toList()

}