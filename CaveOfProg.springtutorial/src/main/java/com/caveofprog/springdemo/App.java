package com.caveofprog.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
	// when beans.xml is in project root

	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

	// when beans.xml is in package root
	/*
	 * ClassPathXmlApplicationContext context = new
	 * ClassPathXmlApplicationContext("beansPackage.xml");
	 */
	Person person = (Person) context.getBean("person");
	// Another way
	// Person person = (Person)context.getBean("person",Person.class);

	person.speak();
	System.out.println(person);

	// ((ClassPathXmlApplicationContext)context).close();
    }
}
