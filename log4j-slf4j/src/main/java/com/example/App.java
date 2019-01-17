package com.example;

// import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;


public class App
{

    private final Logger logger = LoggerFactory.getLogger(getClass());;

    public static void main( String[] args )
    {
        App obj = new App();
        obj.runMe("log4j test");
        SLF4JBridgeHandler.install();
        obj.runMe("log4j test after install");
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

        int mag = 2;

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
