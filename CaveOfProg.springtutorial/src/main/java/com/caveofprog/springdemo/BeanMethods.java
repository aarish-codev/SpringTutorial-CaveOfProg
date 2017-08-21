package com.caveofprog.springdemo;

public class BeanMethods
{
    public static void onCreate(){
	System.out.println("Our onInit() called");
    }
    
    public static void onFinish(){
	System.out.println("Our onDestroy() called");
    }
    
   
}
