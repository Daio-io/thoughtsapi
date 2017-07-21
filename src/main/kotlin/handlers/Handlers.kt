package handlers

import db.Database
import models.ThoughtResult
import random
import sparkHandler

class Handlers(private val database: Database) {

    val randomHandler = sparkHandler {
        response.header("Content-Type", AppConstants.JSON_CONTENT)
        val text = database.getShowerThoughts().random().replace("\"", "'")
        ThoughtResult("success", text).toJson()
    }

    val allHandler = sparkHandler {
        database.getShowerThoughts()
    }

    val statusHandler = sparkHandler {
        response.header("Content-Type", AppConstants.JSON_CONTENT)
        "{\"status\":\"OK\"}"
    }

}