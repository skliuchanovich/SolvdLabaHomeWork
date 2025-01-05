package com.solvd.interfaces;


import com.solvd.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IHorseBehavior {
    Logger LOGGER = LogManager.getLogger(IHorseBehavior.class);
   default void horseSound(){
       LOGGER.info("Brrrrrrrr");
   }

   void gallop();
}
