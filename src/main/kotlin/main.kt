import db.Database
import handlers.Handlers
import spark.kotlin.ignite


fun main(args: Array<String>) {
    val handlers = Handlers(Database)
    val http = ignite()
    http.port(AppConstants.PORT)
    http.get("/rand", function = handlers.randomHandler)
}