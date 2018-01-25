package com.test;

import com.test.list.LimitLinkedList;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1)
			System.exit(8);
		LimitLinkedList<String> list = ReadFile.getlastLineFromFile(args[0], 42);

		if (list == null)
			return;

		while (!list.isEmpty()) {
			System.out.println(list.pollFirst());
		}
	}
}
