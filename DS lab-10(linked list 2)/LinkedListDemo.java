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

	public void insertAtMiddle(int a){
		Node newNode = new Node(a);
		int count = size();

		if(count == 0){
			head = newNode;
			last = newNode;
		}
		else if(count == 1){
			head.next = newNode;
			last = newNode;
		}
		else{
			count = (count/2) - 1;
			Node save = head;
			for(int i=0;i<count;i++){
				save = save.next;
			}
			newNode.next = save.next;
			save.next = newNode;
		}
	}

	public void insertAtIndex(int a,int index){
		Node newNode = new Node(a);
		int sizeL = size();
		if(index<=(sizeL+1)){

		}
	}

	public Node deleteAtfirst(){
		Node save = head;
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			head = head.next;
		}
		return save;
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

public class LinkedListDemo{
	public static void main(String[] args){
		LinkedList l1 = new LinkedList(); 
		LinkedList l2 = new LinkedList(); 

		l1.insertAtfFirst(10);  l1.display();
		l1.insertAtfFirst(20);
		l1.insertAtfFirst(30);
		l1.insertAtLast(40);     l1.display();
		l1.insertAtIndex(50,2);  l1.display();

		l2.insertAtfFirst(l1.deleteAtfirst().value);
		Node n1 = l1.deleteAtfirst();
		  l2.display();
		    l1.display();
		   System.out.println("\n"+n1.value);
	}
}