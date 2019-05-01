package com.github.daggerok

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.json.Json
import javax.json.JsonObject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.APPLICATION_JSON

val log = LoggerFactory.getLogger(Rest::class.java)

@Path("v1")
@ApplicationScoped
@Produces(APPLICATION_JSON)
open class Rest {

  @GET
  @Path("")
  open fun index(): JsonObject {
    log.info("index")
    val builder = Json.createObjectBuilder()
    System.getProperties().forEach { key, value -> builder.add("$key", "$value") }
    return builder.build()
  }

  @GET
  @Path("props")
  open fun props(): JsonObject {
    log.info("props")
    val builder = Json.createObjectBuilder()
    System.getProperties().forEach { key, value -> builder.add(key as String, value as String) }
    return builder.build()
  }

  @GET
  @Path("{path}")
  open fun path(@PathParam("path") path: String): JsonObject {
    log.info("path: {}", path)
    val builder = Json.createObjectBuilder()
    System.getProperties().forEach { key, value -> builder.add(key as String, value as String) }
    return builder.build()
  }
}
