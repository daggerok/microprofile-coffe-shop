//package com.github.daggerok
//
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import javax.enterprise.context.ApplicationScoped
//import javax.enterprise.inject.Produces
//import javax.enterprise.inject.spi.InjectionPoint
//
//@ApplicationScoped
//open class Logs {
//
//  @Produces
//  open fun produceLogger(injectionPoint: InjectionPoint): Logger {
//    val name = injectionPoint.getMember().getDeclaringClass().getName()
//    return LoggerFactory.getLogger(name)
//  }
//}
