package Day14_programs;

public class UC7 {
	Node head;

	// adding at last
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

	// list printing
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

	// search element
	public int search(int data) {
		Node temp = head;
		int flag = 0;
		while (temp != null) {
			if (temp.data == data) {
				flag = 1;
			}
			temp = temp.next;
		}
		if (flag == 1) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}
		return flag;
	}
}
