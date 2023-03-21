import java.util.Scanner;

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
			System.out.println("Sack is empty");
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
}

public class proNo2_using_stack{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the the string you want ro check(enter aaabbb)");
	}	
}

