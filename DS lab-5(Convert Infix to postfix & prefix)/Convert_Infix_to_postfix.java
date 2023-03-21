import java.util.Scanner;

public class Convert_Infix_to_postfix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an infix string");
		String infix = sc.next();

		MyStack s1 = new MyStack();
		String postfix ="";

		for(int i=0;i<infix.length();i++){
			char c = infix.charAt(i);

			if(c!='/' && c!='*' && c!='+' && c!='-' && c!=')' && c!='('){
				postfix += c;
			}
			else if(c=='('){
				s1.push(c);
			}
			else if(c==')'){
				while(s1.peek() != '('){
					postfix += s1.pop();
				}
				s1.delTop();
			}
			else if(precedence(s1.peek())>precedence(c)){
				postfix += s1.pop();
				s1.push(c);
			}
			else
				s1.push(c);
		}

		while(s1.isEmpty() == false){
			postfix+=s1.pop();
		}

		System.out.println(postfix);
		System.out.println("done");
	}


	public static int precedence(char c){
		switch(c){
			case '/': {
				return 4;
			}
			case '*' :{
				return 3;
			}
			case '+' :{
				return 2;
			}
			case '-' :{
				return 1;
			}
			default :
				return 0;
		}
	}
}

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
			
			return 0;
		}
		else{
			return a[top--];
		}
	}
	public char peek(){
		if(top==-1){
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

	public void delTop(){
		top--;
	}
}