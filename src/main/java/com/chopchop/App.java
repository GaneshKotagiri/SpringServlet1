package com.chopchop;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.startup.Tomcat;

import java.io.DataOutput;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("The application has started!");

        Tomcat tomcat=new Tomcat();

        Context context=tomcat.addContext("",null);
        tomcat.addServlet(context,"servlet",new servlet());
        context.addServletMappingDecoded("/hello","servlet");

        tomcat.start();
        tomcat.getServer().await();
        System.out.println("the application is running!!");

    }
}
