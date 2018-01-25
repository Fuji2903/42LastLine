package com.lastline.list;

import java.util.LinkedList;

public class LimitLinkedList<E> {

	public int limit;
	private LinkedList<E> linkedList;

	public LimitLinkedList(int limit) {
		this.linkedList = new LinkedList<>();
		this.limit = limit;
	}

	public void push(E value) {
		this.linkedList.push(value);
		if (this.linkedList.size() > limit) {
			this.linkedList.pollLast();
		}
	}

	public boolean isEmpty() {
		return this.linkedList.isEmpty();
	}

	public int size() {
		return this.linkedList.size();
	}

	public E pollFirst() {
		return this.linkedList.pollLast();
	}
}
