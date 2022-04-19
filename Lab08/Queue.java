/**
 * @author Robin Johnson
 * @version 1.0
 */

import java.util.*;
import java.io.*;
import java.lang.*;

public class Queue<T> {

	/**
	 * Instantiate the needed datastructures in here (HINT: You might want to use
	 * arraylist)
	 */
	private ArrayList<T> elements;

	public Queue() {
		this.elements = new ArrayList<T>();
	}

	/**
	 * Inserts the specified element into this queue if it is possible to do so
	 * immediately without violating capacity restrictions. When using a
	 * capacity-restricted queue, this method is generally preferable to add(E),
	 * which can fail to insert an element only by throwing an exception.
	 *
	 * @param element The element to add
	 */
	public void offer(T element) throws ClassCastException, NullPointerException, IllegalArgumentException {
		this.elements.add(element);
	}

	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null if
	 * this queue is empty.
	 *
	 * @return the head of the queue, or null if the queue is empty
	 */
	public T peek() throws NoSuchElementException, IndexOutOfBoundsException  {
		if(elements.isEmpty()){
			return null;
		}
		return elements.get(0);
	}

	/**
	 * Retrieves and removes the head of this queue, or returns null if this queue
	 * is empty.
	 *
	 * @return the head of the queue, or null if the queue is empty
	 *
	 */
	public T poll() throws NoSuchElementException, IndexOutOfBoundsException { 
		if(elements.isEmpty()){
			return null;
		}
		return this.elements.remove(0);
	}

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		queue.offer("This");
		queue.offer("is");
		queue.offer("a");
		queue.offer("queue");

		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek() + System.lineSeparator());

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll() + System.lineSeparator());

		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}
}