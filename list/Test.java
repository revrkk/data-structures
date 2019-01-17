package list;

public class Test {

	private static void testArrayList() {

		List<String> list = new ArrayList<String>();
		list.add("revanth");
		list.add("surya");
		list.add("vivek");
		list.add("deepan");
		list.add("surya");
		System.out.println(list.toString());

		list.remove("revanth");
		System.out.println(list.toString());

		boolean exist = list.contains("revanth");
		System.out.println(exist);

		boolean exist1 = list.contains("surya");
		System.out.println(exist1);

		list.set(0, "unknown");
		System.out.println(list.toString());

		String name = list.get(3);
		System.out.println(name);

		list.removeAll();
		System.out.println(list);

	}

	private static void testLinkedList() {
		List<String> list = new LinkedList<String>();
		list.add("revanth");
		list.add("surya");
		list.add("vivek");
		list.add("deepan");
		list.add("surya");
		System.out.println(list.toString());

	}

	public static void main(String[] args) {
		// testArrayList();
		testLinkedList();
	}
}
