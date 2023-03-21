public class QueueDemo_with_array{
	public static void main(String[] args){
		MyQueue q = new MyQueue(5);

		q.enqueue(1);
		q.display();
		q.enqueue(2);
		q.display();
		q.enqueue(3);
		q.display();
		q.enqueue(4);
		q.display();
		q.deaueue();
		q.display();
		q.deaueue();
		q.display();
		q.enqueue(5);
		q.display();
		q.enqueue(6);
	}
}

class MyQueue{
	int f = -1;
	int r = -1;
	int n;
	int[] a;
	public MyQueue(int n){
		this.n = n;
		a = new int[n];
	}

	public void enqueue(int element){
		if(r>=(n-1)){
			System.out.println("queue is overflow");
		}
		else{
			r++;
			a[r]=element;
		}

		if(f==-1){
			f=0;
		}
	}
	public int deaueue(){
		if(f==-1 || f>r){
			System.out.println("queue is underflow");
			return 0;
		}
		else{
			return a[f++];
		}
	}

	public void display(){
		for(int i=f;i<r+1;i++){
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}

	
}