package com.sda;

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
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Number of beans: " + appContext.getBeanDefinitionCount());

        final Greeter greeter = appContext.getBean(Greeter.class);

        System.out.println(greeter.getLanguage());
        System.out.println(greeter.sayHello(" World!!!"));
    }
}
