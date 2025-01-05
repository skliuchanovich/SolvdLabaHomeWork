package com.solvd.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ICatBehavior {
    Logger LOGGER = LogManager.getLogger(ICatBehavior.class);

    default void meowMeow() {
        LOGGER.info("Meow Meow");
    }

    String playingWithToy(String toy);
}
