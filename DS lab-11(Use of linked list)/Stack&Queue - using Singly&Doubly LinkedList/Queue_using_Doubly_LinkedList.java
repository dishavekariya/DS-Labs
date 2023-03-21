class Node{
	int value;
	Node next = null;
	Node pre = null;

	public Node(int a){
		this.value = a;
	}
}

class LinkedList{
	Node head = null;
	Node last = null;

	class Node{
		int value;
		Node next = null;
		Node pre = null;

		public Node(int a){
			this.value = a;
		}
	}

	public void insertAtLast(int a){
		Node newNode = new Node(a);

		if(head == null){
			head = newNode;
			last = newNode;
		}
		else{
			last.next = newNode;
			last = newNode;
		}
	}

	public int getFromFirst(){
		if(head == null){
			System.out.println("LinkedList is empty");
			return 0;
		}
		else{
			int saveValue = head.value;
			head = head.next;
			head.pre = null;
			return saveValue;
		}
	}

	public void display(){
		Node save = head;
		System.out.println();

		while(save != null){
			System.out.print(save.value + " ");
			save = save.next;
		}
	}

	public int size(){
		Node save = head;
		int count = 0;

		while(save != null){
			count++;
			save = save.next;
		}
		return count;
	}
}

class Queue{
	LinkedList l1 = new LinkedList();
	Node top = null;

	public void enqueue(int a){
		l1.insertAtLast(a);
	}

	public int dequeue(){
		if(l1.head == null){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return l1.getFromFirst();
		}
	}

	public void display(){
		l1.display();
	}
}

public class Queue_using_Doubly_LinkedList{
	public static void main(String[] args) {
		Queue s1 = new Queue();

		s1.enqueue(10);
		s1.enqueue(20);
		s1.enqueue(30);
		s1.enqueue(40);
		s1.enqueue(50);
		s1.enqueue(60);
		s1.display();
		System.out.print("\n"+s1.dequeue());
		s1.display();
	}
}
