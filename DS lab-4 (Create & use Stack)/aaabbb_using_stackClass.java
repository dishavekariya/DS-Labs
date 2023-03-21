import java.util.Scanner;

class MyStack{
	char[] a = new char[100];
	private int top = -1;

	public void push(char n){
		if(top==(a.length-1)){
			System.out.println("SackOverFlow");
		}
		else{
			top++;
			a[top]=n;
		}
	}
	public char pop(){
		if(top==-1){
			System.out.println("Sack is empty");
			return 0;
		}
		else{
			return a[top--];
		}
	}
	public char peek(){
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

	public int getTop(){
		return top;
	}
}

public class aaabbb_using_stackClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyStack s1 = new MyStack();
		String str = sc.next();
		int l = str.length();
		int countB = 0;

		for(int i=0;i<l;i++){
			char c = str.charAt(i);

			if(c=='a'){
				s1.push(c);
				countB++;
			}
			else{
				s1.push(c);
			}
		}

		while(s1.getTop() != -1){
			char c = s1.pop();
			if(c=='b'){
				countB--;
			}
			else{
				break;
			}
		}

		if(countB==0){
			System.out.println("Valid string");
		}
		else
			System.out.println("Invalid string");
	}	
}

