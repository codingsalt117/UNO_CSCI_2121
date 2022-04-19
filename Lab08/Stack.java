/**
 * @author Robin Johnson
 * @version 1.0
 * 
 */

import java.util.*;
import java.io.*;
import java.lang.*;

public class Stack<T> {

	/** You might want to use arraylist for this too */
	private ArrayList<T> elements;
	
	public Stack() {
		this.elements = new ArrayList<T>();
	}

	
	/**
	 * Returns the number of components in this stack.
	 *
	 * @return the number of components in the stack
	 */
	public int getSize() {
		
		return this.elements.size();
	}

	

	/**
	 * Tests if this stack is empty.
	 *
	 * @return true if the stack is empty false otherwise
	 */
	public boolean isEmpty() {
		
		return this.elements.isEmpty();
	}

	
	/**
	 * Pushes an item onto the top of this stack.
	 */
	public void push(T item) {
		this.elements.add(item);
	
	}



	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 *
	 * @return the object at the top of this stack
	 */
	public T peek() throws NoSuchElementException {
		T element = this.elements.get(elements.size() - 1);
		return element;
	}

	

	/**
	 * Removes the object at the top of this stack and returns that object as the
	 * value of this function.
	 *
	 * @return The object at the top of this stack
	 */
	public T pop() throws EmptyStackException{
		T popped;
		popped = this.elements.get(elements.size() - 1);
		this.elements.remove(elements.size() - 1);
		return popped;
	}

	

	/**
	 * Prints each component of the stack seperated by a new line character.
	 *
	 * @returns The string representation of the stack
	 */
	@Override
	public String toString() {
		//need to have a for loop to return the values for print
		String toString = "";

		for(int i = 0; i < this.elements.size(); i++){
			toString = toString + this.elements.get(i) + "\n";
		}

		return toString;
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		// Stack<Interger> stackInt = new Stack<Integer>();
		// stackInt.push(10);
		// System.out.println(stackInt.toString());
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		stack.pop();
		stack.pop();
		System.out.println(stack.toString());

		stack.push("still");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
}
