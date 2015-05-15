import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
 
import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
 
appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} Groovy - %msg%n"
  }
}

// 디폴트 DEBUG, com.sample.logback INFO 
//logger("com.sample.logback", INFO)
//root(DEBUG, ["STDOUT"])

// 디폴트 INFO, com.sample.logback DEBUG 
logger("com.sample.logback", DEBUG)
root(INFO, ["STDOUT"])