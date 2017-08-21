package com.caveofprog.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SuppressWarnings("unused")
public class App
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
	// when beans.xml is in project root

	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

	// when beans.xml is in package root
	/*
	 * ClassPathXmlApplicationContext context = new
	 * ClassPathXmlApplicationContext("beansPackage.xml");
	 */
	
	
	/*
	Person person = (Person) context.getBean("person");
	System.out.println(person);
	 person.speak();
	 */
	// Another way
	// Person person = (Person)context.getBean("person",Person.class);

	
	

	// Address address = (Address)context.getBean("address");
	// System.out.println(address);

	BeanMethods beanM = (BeanMethods)context.getBean("beanMethods");
	
	
	
	
	((FileSystemXmlApplicationContext)context).close();
    }
}
