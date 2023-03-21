class MyStack{
	int[] a = new int[100];
	int top = -1;

	public void push(int n){
		if(top==(a.length-1)){
			System.out.println("SackOverFlow");
		}
		else{
			top++;
			a[top]=n;
		}
	}
	public int pop(){
		if(top==-1){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return a[top--];
		}
	}
	public int peek(){
		if(top==-1){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return a[top];
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(a[i]+" ");
		}
	}
	public boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	public void change(int m,int num){
		if(m>=0 && m<=top){
			a[m] = num;
		}
		else{
			System.out.println("Index does not exist in this stack");
		}
		
	}
}

public class StackDemo{
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(12);

		System.out.println(s.pop());
		System.out.println(s.peek());

		s.push(5);
		s.push(12);
		s.display();
		if(s.isEmpty())
			System.out.println("\nyes it is empty");
		else
			System.out.println("\nno it is not empty");
	}
}