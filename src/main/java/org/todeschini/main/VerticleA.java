package org.todeschini.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class VerticleA extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(VerticleA.class);
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start vertx " + this.getClass().getName());
    vertx.deployVerticle(new VerticleAA(), whenDeployed -> {
      System.out.println("Deploy " + VerticleAA.class.getName());
      vertx.undeploy(whenDeployed.result());
    });
    vertx.deployVerticle(new VerticleAB(), whenDeployed -> {
      System.out.println("Deploy " + VerticleAB.class.getName());
      // Do nothing
      // vertx.undeploy(whenDeployed.result());
    });
    startPromise.complete();
  }
}
