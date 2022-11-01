package org.todeschini.main;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleAA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start vertx " + this.getClass().getName());
    startPromise.complete();
  }

  @Override
  public void stop(Promise<Void> stopPromise) throws Exception {
    //super.stop(stopPromise);
    System.out.println("parando " + getClass().getName());
    stopPromise.complete();
  }
}
