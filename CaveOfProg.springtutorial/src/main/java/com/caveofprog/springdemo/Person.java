package com.caveofprog.springdemo;

public class Person
{
    /*
     * id and name are using constructor args
     * taxId is done using property 
     */
    private int id;
    private String name;
    private int taxId;	// Camel casing is important here
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public Person() {
	// TODO Auto-generated constructor stub
    }

    public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    

    @Override
    public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
    }

    public void speak() {
	System.out.println("Hello! I am a person.");
    }

}
