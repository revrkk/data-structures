package list;

public interface List<A> {
	void add(A a);
	void remove(A a);
	boolean contains(A a);
	void removeAll();
	A get(int i);
	void set(int i, A a);
	void remove(int i);
	int size();
}
