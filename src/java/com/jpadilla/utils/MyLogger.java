/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.utils;

import java.io.File;
import java.net.URL;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author jpadilla
 */
public class MyLogger extends Logger {
    private URL Path = getClass().getResource("/com/jpadilla/utils/logs.properties");
    private static MyLoggerFactory myFactory = new MyLoggerFactory();
      
    public MyLogger(String name){
        super(name);
        PropertyConfigurator.configure(Path);
    }
    
    public static Logger getLogger(String name) {
        return Logger.getLogger(name, myFactory); 
    }    
  
    @Override
    public void debug(Object message) { 
       super. debug(message);
    }

    @Override
    public void debug(Object message, Throwable t) { 
        super.debug(message, t);
    }
    
    @Override
    public void error(Object message) { 
        super.error(message);
    }
   
    public void error(Object message, Throwable t, String User) { 
        super.error(message+"---Usuario: "+User,t);
    }
    
    @Override
    public void error(Object message, Throwable t) { 
        super.error(message, t);
    }

    @Override
    public void fatal(Object message) { 
        super.fatal(message);
    }

    @Override
    public void fatal(Object message, Throwable t) { 
        super.fatal(message, t);
    }
    
    public void fatal(Object message, Throwable t,String User) { 
        super.fatal(message+"---Usuario: "+User,t);
    }
    
    @Override
    public void info(Object message) { 
        super.info(message);
    }

    @Override
    public void info(Object message, Throwable t) { 
        super.info(message, t);
    }

    public void info(Object message, Throwable t,String User) { 
        super.info(message+"---Usuario: "+User,t);
    }
  
    public void info(Object message, String User) { 
        super.info(message+"---Usuario: "+User);
    }
    
    @Override
    public void warn(Object message) { 
        super.warn(message);
    }

    @Override
    public void warn(Object message, Throwable t) { 
        super.warn(message, t);
    }
}

