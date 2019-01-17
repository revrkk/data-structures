package list;

public interface Queue<A> {
	void add(A a);
	void remove(A a);
	A peek();
}
