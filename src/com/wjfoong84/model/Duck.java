package com.wjfoong84.model;

public class Duck extends Bird implements Swim {

	@Override
    public void sing() { 
        System.out.println("Quack, quack"); 
    }

	@Override
	public void swim() {
		System.out.println("I am swimming");
	} 
	
}
