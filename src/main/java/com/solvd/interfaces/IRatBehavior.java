package com.solvd.interfaces;

import com.solvd.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IRatBehavior {
    Logger LOGGER = LogManager.getLogger(IRatBehavior.class);

    default void running() {
        LOGGER.info("The rat is running away");
    }

    void tryingToSteal(String food);
}
