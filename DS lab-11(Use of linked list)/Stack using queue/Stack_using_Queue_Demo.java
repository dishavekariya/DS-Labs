public class Stack_using_Queue_Demo{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.display();
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		s.display();
	}
}
class Stack{
	Queue q1 = new Queue();
	Queue q2 = new Queue();

	public void push(int a){
		if(q1.size() != 0){
			q1.enqueue(a);
		}
		else{
			q2.enqueue(a);
		}
	}
	public int pop(){
		if(q1.size()==0 && q2.size()!=0 ){
			int l = q2.size();
			l--;
			for(int i=0;i<l;i++){
				q1.enqueue(q2.dequeue());
			}
			return q2.dequeue();
		}
		else if(q2.size()==0 && q1.size()!=0 ){
			int l = q1.size();
			l--;
			for(int i=0;i<l;i++){
				q2.enqueue(q1.dequeue());
			}
			return q1.dequeue();
		}
		else{
			System.out.println("Stack is Empty");
			return 0;
		}
	}
	public int peek(){
		if(q1.size()==0 && q2.size()!=0 ){
			int l = q2.size();
			l--;
			for(int i=0;i<l;i++){
				q1.enqueue(q2.dequeue());
			}
			Node n = new Node(q2.dequeue());
			q1.enqueue(n.value);

			return n.value;
		}
		else if(q2.size()==0 && q1.size()!=0 ){
			int l = q1.size();
			l--;
			for(int i=0;i<l;i++){
				q2.enqueue(q1.dequeue());
			}
			Node n = new Node(q1.dequeue());
			q2.enqueue(n.value);

			return n.value;
		}
		else{
			System.out.println("Stack is Empty");
			return 0;
		}
	}

	public void display(){
		if(q1.size() != 0){
			q1.display();
		}
		else if(q2.size() != 0){
			q2.display();
		}
		else{
			System.out.println("Stack is empty");
		}
	}


}

class Node{
	int value;
	Node next = null;

	public Node(int a){
		value = a;
	}
}

class Queue{
	Node head = null;
	Node last = null;

	class Node{
		int value;
		Node next = null;

		public Node(int a){
			value = a;
		}
	}
	
	public void enqueue(int a){
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
		public int dequeue(){
			if(head != null){
				Node temp = head;
				head = head.next;
				return temp.value;
			}
			else{
				System.out.println("Queue is empty. Cant dequeue.");
				return 0;
			}
		}
		public int size(){
			if(head==null){
				return 0;
			}
			else{
				int count =0;
				Node save = head;
				while(save!=null){
					count++;
					save = save.next;
				}
				return count;
			}
		}
}