package list;

public class LinkedList<AO> implements List<AO>, Queue<AO> {

	private Node<AO> firstNode;

	private Node<AO> lastNode;

	private int size = 0;

	public LinkedList() {

	}

	public void add(AO a) {
		Node<AO> newNode = new Node<AO>(a, lastNode, null);
		if (firstNode == null) {
			firstNode = newNode;
		}
		if (lastNode == null) {
			lastNode = newNode;
		} else {
			lastNode.next = newNode;
		}
		size++;
	}

	public void remove(AO a) {
		lastNode.prev.next = null;
		lastNode.prev = null;
		size--;
	}

	public boolean contains(AO a) {
		Node<AO> n = firstNode;
		while (n != null) {
			if (n.value.equals(a)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	public void removeAll() {
		firstNode = null;
	}

	public AO get(int i) {
		Node<AO> n = firstNode;
		for (int j = 0; j <= i; j++) {
			if (j == i)
				return n.value;
			else
				n = n.next;
		}
		return null;
	}

	public void set(int i, AO a) {
		Node<AO> n = firstNode;
		for (int j = 0; j <= i; j++) {
			if (j == i)
				n.value = a;
			else
				n = n.next;
		}
	}

	public void remove(int i) {
		Node<AO> n = firstNode;
		for (int j = 0; j <= i; j++) {
			if (j == i) {
				n.prev.next = null;
				n.prev = null;
			} else
				n = n.next;
		}
	}

	public int size() {
		return size;
	}

	public AO peek() {
		return lastNode.value;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<AO> n = firstNode;
		while(n != null) {
			builder.append(n.value);
			n = n.next;
		}
		return builder.toString();
	}

	class Node<AO> {
		AO value;
		Node<AO> prev;
		Node<AO> next;

		public Node(AO value, Node<AO> prev, Node<AO> next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}
