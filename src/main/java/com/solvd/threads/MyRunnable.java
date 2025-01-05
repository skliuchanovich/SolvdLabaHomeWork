package com.solvd.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRunnable implements Runnable {
    public static final Logger LOGGER = LogManager.getLogger(MyRunnable.class);

    @Override
    public void run() {
        LOGGER.info("MyRunnable is running");

    }
}
