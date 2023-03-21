public class HappyNum_Using_DynamicDS{
	public static void main(String[] args){
		Link l = new Link();
		int n = 50;
		int i=1;

		while(n != 1){
			if(l.doesInclude(n)){
				System.out.println("non Happy num");
				break;
			}
			l.addElement(n);
			n = getSumOfSqr(n);

			l.display();
		}
		if(n==1){
			System.out.println("is Happy num");
		}
		l.display();

	}
	public static int getSumOfSqr(int n){
		int temp=0;
		while(n>=1){
			temp += (n%10)*(n%10);
			n /= 10;
		}
		return temp;
	}
}
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
	public boolean doesInclude(int a){
		Node temp = head;
		while(temp != null){
			if(temp.value==a){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
}