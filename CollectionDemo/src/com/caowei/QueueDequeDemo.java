package com.caowei;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Queue�ӿڣ����У�һ���Ƚ��ȳ����������ݽṹ
 * LinkedList��ʵ����queue�ӿ�
 * ������У���Ϣ����
 * 
 * Deque�ӿڣ�˫�˶��У��������˶����Խ��в���
 * LinkedListʵ���˸ýӿ�
 * 
 * Stack��:��ջ���Ƚ����
 *
 */
public class QueueDequeDemo {
	
	private static void stack() {
		Stack<String> s = new Stack<>();
		s.push("bin");
		s.push("lili");
		s.push("tom");
		System.out.println(s.peek());  //ȡ  ���Ƴ�
		System.out.println(s.pop());  //ȡ ���Ƴ�
		System.out.println(s.pop());  //ȡ ���Ƴ�
	}
	private static void deque() {
		Deque<String> deque = new LinkedList<>();
		deque.add("С��");
		deque.add("С��");
		deque.add("С��");
		deque.add("С��");
		deque.add("С��");
		deque.add("Сΰ");
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
	}
	private static void queue() {
		Queue<String> queue = new LinkedList<>();
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		queue.add("С��");
		queue.add("Сΰ");
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	public static void main(String[] args) {
//		queue();
//		deque();
		stack();
	}

}
