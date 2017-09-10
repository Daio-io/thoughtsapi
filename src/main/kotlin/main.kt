import db.Database
import handlers.Handlers
import spark.kotlin.ignite


fun main(args: Array<String>) {
    val handlers = Handlers(Database)
    val spark = ignite()
    spark.port(AppConstants.PORT)
    spark.get("/rand", function = handlers.randomShowerHandler)
    spark.get("/tils", function = handlers.randomTilHandler)
    spark.get("/status", function = handlers.statusHandler)
}