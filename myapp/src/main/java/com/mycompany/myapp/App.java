package com.mycompany.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        
        HelloWorld object = (HelloWorld) context.getBean("helloBean");
        object.printHello();
        
        Other otherObject = (Other) context.getBean("o");
        System.out.println(otherObject.sum());
        
    }
}
