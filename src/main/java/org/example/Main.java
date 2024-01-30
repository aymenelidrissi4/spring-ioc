package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
            Person person = applicationContext.getBean("tom", Person.class);
            System.out.println("First Name : " + person.getFirstName() + " , Last Name : " + person.getLastName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}