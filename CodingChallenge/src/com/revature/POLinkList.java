package com.revature;

import java.util.LinkedList;

//1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.
//
//For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. 
//In this example, assume nodes with the same value are the exact same node objects.
//
//Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
public class POLinkList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(3);
		list1.add(7);
		list1.add(8);
		list1.add(10);

		list2.add(99);
		list2.add(1);
		list2.add(8);
		list2.add(10);

		if (list1.size() == list2.size()) {
			for (int l = 0; l < list1.size(); l++) {
				if (list1.get(l) == list2.get(l)) {
					System.out.println("The Intersecting Node is:"+list1.get(l));
					break;

				}
			}
		}
	}
}
