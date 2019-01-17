package tree;

import java.util.ArrayList;
import java.util.Arrays;

public class MinHeap<T> implements Heap<T> {

	int defaultSize = 10;
	private int size = defaultSize;
	private int limit;
	Object[] heapValues;
	
	public MinHeap() {
		limit = defaultSize;
		heapValues = new Object[this.defaultSize];
	}
	
	private void ensureCapacity() {
		if(limit == size) {
			heapValues = Arrays.copyOf(heapValues, limit *= 2);
		}
	}
	
	public T pop() {
		return null;
	}

	public void push(T t) {
		
	}

	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
