package io.druid.server.log;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.druid.java.util.common.logger.Logger;

/**
 * Provider for {@link NetflixHttpPostRequestLogger}
 */
@JsonTypeName("nflx-keystone")
public class NetflixHttpPostRequestLoggerProvider implements RequestLoggerProvider
{
  private static final Logger log = new Logger(NetflixHttpPostRequestLoggerProvider.class);

  @Override
  public RequestLogger get()
  {
    NetflixHttpPostRequestLogger logger = new NetflixHttpPostRequestLogger();
    log.debug(new Exception("Stack trace"), "Creating %s at", logger);
    return logger;
  }
}
