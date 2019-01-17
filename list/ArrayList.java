package list;

import java.util.Arrays;

public class ArrayList<A> implements List<A> {

	private static final int INITIAL_CAPACITY = 10;

	private final Object[] EMPTY_ARRAY = {};

	private transient A[] elements;

	private int size = 0;

	private int actualSize = INITIAL_CAPACITY;

	public ArrayList() {
		elements = (A[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	public ArrayList(int capacity) {
		if (capacity > INITIAL_CAPACITY) {
			elements = (A[]) new Object[capacity];
			actualSize = capacity;
		} else {
			elements = (A[]) new Object[INITIAL_CAPACITY];
		}
		size = 0;
	}

	public void add(A a) {
		if (!hasCapacity()) {
			expand();
		}
		elements[size++] = a;
	}

	private void expand() {
		elements = Arrays.copyOf(elements, actualSize + (actualSize >> 1));
	}

	private boolean hasCapacity() {
		return size < actualSize;
	}

	public void remove(A a) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(a)) {
				remove(i);
				break;
			}
		}
	}

	public boolean contains(A a) {
		boolean contains = false;
		for (int j = 0; j < size; j++) {
			contains = elements[j].equals(a);
		}
		return contains;
	}

	public void removeAll() {
		elements = (A[]) EMPTY_ARRAY;
		size = 0;
	}

	public A get(int i) {
		if (i > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		A a = elements[i];
		return a;
	}

	public void set(int i, A a) {
		if (i > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		elements[i] = a;
	}

	public void remove(int i) {
		for (int j = i; j < size; j++) {
			elements[j] = elements[j+1];
		}
		size--;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i =0; i<size; i++) {
			builder.append(elements[i]);
			builder.append(" ");
		}
		return builder.toString();
	}

	public int size() {
		return size;
	}
}
