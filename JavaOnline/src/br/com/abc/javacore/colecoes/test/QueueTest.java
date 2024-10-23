package br.com.abc.javacore.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	public static void main (String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("D");
		queue.add("A");
		queue.add("B");
		System.out.println(queue.remove("B"));
		System.out.println(queue.size());
	}
}
