package com.workiva.frugal.server;

/**
 * A default event handler for an FNatsServer.
 */
public class FDefaultNatsServerEventHandler extends FDefaultServerEventHandler {
    public FDefaultNatsServerEventHandler(long highWatermark) {
        super(highWatermark);
    }
}
