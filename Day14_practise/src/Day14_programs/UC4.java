package Day14_programs;

import java.util.Scanner;

public class UC4 {
	Node head;

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	// inserting data in between
	public void insertInBetween(int data) {
		Node node = new Node(data);
		Node temp = head;
		temp = temp.next;
		head.next = node;
		node.next = temp;

	}

	// list printing
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
}
