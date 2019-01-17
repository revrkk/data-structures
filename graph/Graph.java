package graph;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Implementation of undirected graph using adjacency list
 * 
 * @author revanth_v
 *
 */
public class Graph {

	private List<Integer>[] nodes = null;
	private int numberOfNodes;

	@SuppressWarnings("unused")
	private Graph() {
	}

	@SuppressWarnings("unchecked")
	public Graph(int numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
		nodes = new LinkedList[numberOfNodes];
		for (int i = 0; i < numberOfNodes; i++) {
			nodes[i] = new LinkedList<>();
		}
	}

	public void addEdge(int from, int to) {
		nodes[from].add(to);
		nodes[to].add(from);
	}

	public void breadthFirstSearch(int from) {
		boolean[] visited = new boolean[numberOfNodes];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(from);
		visited[from] = true;
		while (!q.isEmpty()) {
			int e = q.poll();
			System.out.print(e + " ");
			for (int n : nodes[e]) {
				if (!visited[n]) {
					q.add(n);
					visited[n] = true;
				}
			}
		}
	}

	public void depthFirstSearch(int from) {
		boolean[] visited = new boolean[numberOfNodes];
		int top = -1;
		int[] stack = new int[numberOfNodes];
		stack[++top] = from;
		visited[from] = true;
		while (top != -1) {
			int e = stack[top--];
			System.out.print(e + " ");
			for (int n : nodes[e]) {
				if (!visited[n]) {
					stack[++top] = n;
					visited[n] = true;
				}
			}
		}
	}
}
