package com.self.learning.ds.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.self.learning.ds.impl.StackArrayImpl;

/**
 * Test class for stack array implementation. Integer data type is used for
 * class.
 * 
 * @author Aditya Ajmera
 *
 */
class StackArrayImplTest {
	private StackArrayImpl<Integer> intStack;

	@BeforeEach
	void setup() {
		intStack = new StackArrayImpl<Integer>(5);
	}

	@Test
	void testPush() {
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		intStack.push(5);
		assertThrows(StackOverflowError.class, ()->{intStack.push(6);});
		
	}

	@Test
	void testPop() {
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		int val = intStack.pop();
		assertEquals(3, val);
		
		intStack.push(4);
		val = intStack.pop();
		assertEquals(4, val);
	}

}
