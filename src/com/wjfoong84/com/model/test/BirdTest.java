package com.wjfoong84.com.model.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.wjfoong84.model.Bird;

public class BirdTest {

	@Test
    public void FlyTest() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		Bird bird = new Bird();
		bird.fly();
        
        assertEquals("I am flying", outContent.toString());
	}
	
	@Test
    public void SingTest() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		Bird bird = new Bird();
		bird.sing();
        
        assertEquals("I am singing", outContent.toString());
	}
	
	
}
