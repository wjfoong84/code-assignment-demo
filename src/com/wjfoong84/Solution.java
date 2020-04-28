package com.wjfoong84;
import com.wjfoong84.model.Bird;
import com.wjfoong84.model.Chicken;
import com.wjfoong84.model.Duck;

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		// bird.fly(); not all bird fly
		System.out.println();
		bird.sing();

		System.out.println();
		System.out.println();
		
		Chicken chicken = new Chicken();
		chicken.sing(); // check chicken got "Cluck, cluck"
		System.out.println();
		
		Duck duck = new Duck();
		duck.sing(); // check duck got "Quack, quack"
		duck.swim(); // check duck can swim or not
		System.out.println();
	}
	
}
