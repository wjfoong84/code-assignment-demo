package com.wjfoong84.com.model.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.wjfoong84.model.Animal;

public class AnimalTest {

	@Test
    public void WalkTest() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		Animal animal = new Animal();
        animal.walk();
        
        assertEquals("I am walking", outContent.toString());
	}
	
}
