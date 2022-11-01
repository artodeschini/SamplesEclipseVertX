package org.todeschini.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class VerticleB extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(VerticleA.class);
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Start vertx " + this.getClass().getName());
    startPromise.complete();
  }
}
