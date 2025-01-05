package com.solvd.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IDogBehavior {
    Logger LOGGER = LogManager.getLogger(IDogBehavior.class);

    default void bark() {
        LOGGER.info("Gaw gaw!");
    }

    boolean isReadyToPlay(boolean readyOrNot);

}
