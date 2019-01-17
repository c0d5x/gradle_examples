package com.example;

import org.apache.log4j.Logger;

public class App
{

    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        App obj = new App();
        obj.runMe("log4j test");
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

        for (int a=0; a<20; a++){
          logger.fatal("This is fatal : " + parameter);
          for (int b=0; b<10; b++){
            logger.error("This is error : " + parameter);
            for (int c=0; c<10; c++){
              logger.warn("This is warn : " + parameter);
              for (int d=0; d<10; d++){
                logger.info("This is info : " + parameter);
                for (int e=0; e<10; e++){
                  logger.debug("This is debug : " + parameter);
                }
              }
            }
          }
        }
    }
}
