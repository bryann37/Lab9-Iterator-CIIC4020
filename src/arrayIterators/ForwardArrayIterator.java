package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;

public class ForwardArrayIterator<E> implements Iterator<E> {
	
	
	private int current;

	private E[] arr;    // the array to iterate over
	// other internal fields...
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		current = 0;
		// initialize other internal fields as needed
	}
	
	public boolean hasNext() {
		// rewrite...
		
		return current < arr.length;   
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		// rewrite
		current++;
		return arr[current - 1];
		
	}


	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
