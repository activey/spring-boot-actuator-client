package org.reactor.spring.actuator.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author grabslu
 */
public class ActuatorClientPropertiesReader {

  private final static Logger LOGGER =
      LoggerFactory.getLogger(ActuatorClientPropertiesReader.class);

  private final static String FILE_CLIENT_PROPERTIES = "client.properties";

  private ActuatorClientPropertiesReader() {}

  public static ActuatorClientProperties read() {
    return new ActuatorClientPropertiesReader().readClientProperties();
  }

  private ActuatorClientProperties readClientProperties() {
    InputStream propertiesStream = ActuatorClientPropertiesReader.class.getClassLoader()
        .getResourceAsStream(FILE_CLIENT_PROPERTIES);
    if (propertiesStream == null) {
      LOGGER.warn("Properties file not present. Returning empty properties instead.");
      return new ActuatorClientProperties();
    }

    Properties properties = new Properties();
    try {
      properties.load(propertiesStream);
    } catch (IOException e) {
      LOGGER.warn("Properties file not present or can't read. Returning empty properties instead.");
      return new ActuatorClientProperties();
    }
    LOGGER.debug("Reading '{}' client properties file.", FILE_CLIENT_PROPERTIES);
    return new ActuatorClientProperties(properties);
  }
}
