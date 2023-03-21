public class Circular_Queue_Demo{
	public static void main(String[] args){
		CircularQueue q = new CircularQueue(5);
		q.enqueue(1);
		q.display();
		q.enqueue(2);
		q.display();
		q.enqueue(3);
		q.display();
		q.enqueue(4);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(5);
		q.display();
		q.enqueue(6);
		q.display();
		q.enqueue(10);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(12);
		q.display();

	}
}

class CircularQueue{
	int f = -1;
	int r = -1;
	int n;
	int[] a;

	public CircularQueue(int n){
		this.n = n;
		a = new int[n];
	}

	public void enqueue(int element){
		if(r==(n-1)){
			r=0;
		}
		else{
			r++;
		}

		if(r==f){
			System.out.println("Queue is overflow");
			if(r==0){
				r=n-1;
			}else{
				r--;
			}
		}
		else{
			a[r] = element;
			if(f==-1){
				f=0;
			}
		}
	}

	public int dequeue(){
		int temp;
		if(f==-1){
			System.out.println("Queue is underflow");
			return 0;
		}
		else if(f==r){
			temp = f;
			f=-1;
			r=-1;
			return a[temp];
		}
		else if(r>f){
			return a[f++];
		}
		else {
			if(f==(n-1)){
				f=0;
				return a[n-1];
			}
			else{
				return a[f++];
			}
		}
	}

	public void display(){
		if(f==-1){
			System.out.println("Empty");
		}
		else if(f<=r){
			for(int i=f;i<=r;i++){
				System.out.print(a[i] +" ");
			}
			System.out.println();
		}
		else{
			for(int i=f;i<=(n-1);i++){
				System.out.print(a[i] +" ");
			}
			for(int i=0;i<=r;i++){
				System.out.print(a[i] +" ");
			}
			System.out.println();
		}
	}

	
	public String getQueueAsString(){
		String ans = "";
		if(f==-1){
			System.out.println("Empty");
			return "";
		}
		else if(f<=r){
			for(int i=f;i<=r;i++){
				ans += a[i];
			}
			return ans;
		}
		else{
			for(int i=f;i<=(n-1);i++){
				ans += a[i];
			}
			for(int i=0;i<=r;i++){
				ans += a[i];
			}
			return ans;
		}

	}
	public boolean isEmpty(){
		if(f==-1){
			return true;
		}
		return false;
	}
}