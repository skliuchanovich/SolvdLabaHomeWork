package com.solvd.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread extends Thread {
    public static final Logger LOGGER = LogManager.getLogger(MyThread.class);

    @Override
    public void run() {
        LOGGER.info("MyThread is running");
    }
}
