package com.solvd.interfaces;

import com.solvd.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IRabbitBehavior {
    Logger LOGGER = LogManager.getLogger(IRabbitBehavior.class);
    default void jumping(){
        LOGGER.info("The rabbit is jumping!");
    }
    void eating(String food);
}
