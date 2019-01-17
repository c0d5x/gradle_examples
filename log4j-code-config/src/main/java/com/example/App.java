package com.example;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class App
{

    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        App obj = new App();
        obj.runMe("log4j test");
        Logger.getRootLogger().setLevel(Level.ERROR);
        obj.runMe("log4j test after setting Level to Error");
    }

    public void runMe(String parameter){
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

        int mag = 10;

        for (int a=0; a<mag; a++){
          logger.fatal("This is fatal : " + parameter);
          for (int b=0; b<mag; b++){
            logger.error("This is error : " + parameter);
            for (int c=0; c<mag; c++){
              logger.warn("This is warn : " + parameter);
              for (int d=0; d<mag; d++){
                logger.info("This is info : " + parameter);
                for (int e=0; e<mag; e++){
                  logger.debug("This is debug : " + parameter);
                }
              }
            }
          }
        }
    }
}
