class Node{
	int value;
	Node next = null;

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

		public Node(int a){
			this.value = a;
		}
	}

	public void insertAtfFirst(int a){
		Node newNode = new Node(a);
		if(head==null){
			head = newNode;
			last = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
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

class Stack{
	LinkedList l1 = new LinkedList();
	Node top = null;

	public void push(int a){
		l1.insertAtfFirst(a);
	}

	public int pop(){
		if(l1.head == null){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return l1.getFromFirst();
		}
	}

	public int peek(){
		if(l1.head == null){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return this.l1.head.value;
		}
	}

	public void display(){
		l1.display();
	}
}

public class Stack_using_LinkedList{
	public static void main(String[] args) {
		Stack s1 = new Stack();

		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.display();
		System.out.print("\n"+s1.pop());
		s1.display();
		System.out.print("\n"+s1.peek());
		s1.display();
	}
}
