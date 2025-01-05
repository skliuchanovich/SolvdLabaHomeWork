package com.solvd.interfaces;

import com.solvd.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IAnimalBehavior {
    Logger LOGGER = LogManager.getLogger(IAnimalBehavior.class);
    void sleep();

    void eat();

    void play();

    default void showBasicInfo() {
        LOGGER.info("This animal can sleep, eat, and play");
    }

}
