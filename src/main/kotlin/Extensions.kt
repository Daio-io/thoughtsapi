import spark.kotlin.RouteHandler
import java.util.*

fun sparkHandler(f: RouteHandler.()->Any): RouteHandler.() -> Any = f

internal fun <T> List<T>.random(): T = Random().let { this[it.nextInt(size)] }