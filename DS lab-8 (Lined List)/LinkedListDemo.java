class Link{
	Node head = null;
	Node last = null;

	class Node{
		int value;
		Node next = null;
		Node pre = null;

		public Node(int a){
			value = a;
		}
		
	}
	public void addElement(int a){
		Node newNode = new Node(a);
		if(head==null){
			head = newNode;
			last = head;
		}
		else if(last.next == null){
			last.next = newNode;
			newNode.pre = last;
			last = last.next;

		}
	}
	public void display(){
		if(head==null){
			System.out.println("queue is empty");
		}else{
			Node n;
			for(n=head; n!=null; n=n.next){
				System.out.print(n.value+"-");
			}
			System.out.println();
		}
	}
	public void sort(){
		Link l2 = new Link();
		for(Node temp=head;temp!=null;temp=temp.next){
			int min = temp.value;
			for(Node temp2=temp;temp2!=null;temp2=temp2.next){
				if(temp2.value<min){
					min = temp2.value;
					int tempInt = temp.value;
					temp.value = temp2.value;
					temp2.value = tempInt;
				}
			}
			l2.addElement(min);
		}
		head = l2.head;

		System.out.println("sorted");
	}
}

public class LinkedListDemo{
	public static void main(String[] args) {
		Link l1 = new Link();
		
		l1.addElement(10);
		l1.addElement(30);
		l1.addElement(25);
		l1.addElement(5);
		l1.display();
		l1.sort();
		l1.display();
		
	}
}