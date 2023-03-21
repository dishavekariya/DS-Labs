class Link{
	Node head = null;
	Node last = null;

	class Node{
		int value;
		Node next = null;

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
				last = last.next;
			}
		}
		public void display(){
			Node n;
			for(n=head; n!=null; n=n.next){
				System.out.print(n.value+" ");
			}
		}
}

public class LinkedListDemo{
	public static void main(String[] args) {
		Link l1 = new Link()

		l1.addElement(10);
		l1.addElement(20);
		l1.display();
	}
}