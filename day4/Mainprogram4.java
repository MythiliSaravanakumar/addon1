package addon_day04;

public class Mainprogram4 {
	
	
	    Node head;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int val) {
	            data = val;
	            next = null;
	            prev = null;
	        }
	    }

	    public Mainprogram4() {
	        head = null;
	    }

	    void traverseFromFront() {
	        Node temp = head;
	        System.out.print("Forward Traversal: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    void traverseFromEnd() {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("Reverse Traversal: List is empty.");
	            return;
	        }
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        System.out.print("Reverse Traversal: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	        System.out.println();
	    }

	    void insertAtBeginning(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	    }

	    void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    public static void main(String[] args) {
	        Mainprogram4 list = new Mainprogram4();
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtBeginning(5);
	        list.insertAtBeginning(1);
	        list.traverseFromFront();
	        list.traverseFromEnd();
	    }
	}

