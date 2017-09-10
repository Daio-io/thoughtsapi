package handlers

import db.Database
import models.JsonResult
import random
import sparkHandler

class Handlers(private val database: Database) {

    val randomShowerHandler = sparkHandler {
        response.header("Content-Type", AppConstants.JSON_CONTENT)
        val text = database.getShowerThoughts().random().replace("\"", "'")
        JsonResult("success", text).toJson()
    }

    val randomTilHandler = sparkHandler {
        response.header("Content-Type", AppConstants.JSON_CONTENT)
        val text = database.getTils().random().replace("\"", "'")
        JsonResult("success", text).toJson()
    }

    val allHandler = sparkHandler {
        database.getShowerThoughts()
    }

    val statusHandler = sparkHandler {
        response.header("Content-Type", AppConstants.JSON_CONTENT)
        "{\"status\":\"OK\"}"
    }

}