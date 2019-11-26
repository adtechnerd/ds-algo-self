/**
 * 
 */
package com.self.learning.ds.impl;

import com.self.learning.ds.IStack;

/**
 * @author Aditya Ajmera
 *
 */
public class StackArrayImpl<T> implements IStack<T> {
	private T[] arr;
	private int size;
	private int top;

	/**
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public StackArrayImpl(int size) {
		super();
		this.size = size;
		arr = (T[]) new Object[size];
		top = -1;
	}

	public StackArrayImpl() {
		this(10);
	}

	@Override
	public boolean push(T t) {
		if (top + 1 == size) {
			throw new StackOverflowError("Stack is full");
		} else {
			arr[++top] = t;
			return true;
		}
	}

	@Override
	public T pop() {
		if(top <= -1) {
			throw new StackOverflowError("Stack is empty");
		} else {
			T val = arr[top];
			arr[top--] = null;
			return val;
		}
	}

}
