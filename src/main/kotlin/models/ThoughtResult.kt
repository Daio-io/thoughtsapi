package models

class ThoughtResult(val status: String, val text: String?) : Model {

    override fun toJson(): String {
        return text?.let { "{\"status\":\"$status\", \"text\":\"$it\"}" } ?: "{\"status\":\"failed\", \"text\":\"\"}"
    }
}