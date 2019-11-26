/**
 * 
 */
package com.self.learning.ds;

/**
 * Ordered list data structure supporting addition and deletion from one end.
 * 
 * @author Aditya Ajmera
 *
 */
public interface IStack<T> {

	/**
	 * Add an element to stack
	 * 
	 * @param t
	 */
	void push(T t);

	/**
	 * remove an element from stack.
	 * 
	 * @return
	 */
	T pop();
}
