package Day14_programs;

public class UC9 {
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
	public int insertAfter(int data) {
		Node node = new Node(data);
		int flag = 0;
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			prev = temp;
			temp = temp.next;
			if (prev.data == 30) {
				prev.next = node;
				node.next = temp;
				flag = 1;
				break;
			}

		}
		return flag;
	}

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

	int delete = 0;

	// delete data in between
	public int deleteAfter(int data) {
		int result = search(data);
		if (result == 1) {
			Node temp = head;
			Node prev = head;
			Node nextNode = head;

			while (temp != null) {
				prev = temp;
				temp = temp.next;

				if (temp.data == 40) {
					nextNode = temp.next;
					prev.next = nextNode;
					delete = 1;
					break;
				}

			}

		}
		return delete;
	}

	// getting size of array
	public int size() {
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		System.out.println("size of list is - " + counter);
		return counter;
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
