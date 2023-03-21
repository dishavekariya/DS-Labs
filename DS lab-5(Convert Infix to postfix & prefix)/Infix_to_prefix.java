import java.util.Scanner;

public class Infix_to_prefix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a infix string");
		String infix = sc.next();

		infix = getRevStringOf(infix);
		System.out.println(infix);

		String postfix = convert_Infix_to_postfix(infix);
		System.out.println(postfix);

		postfix = getRevStringOf(postfix);
		System.out.println(postfix);
	}


	public static String convert_Infix_to_postfix(String infix){

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

			return postfix;
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

	public static String getRevStringOf(String str){
		MyStack ms1 = new MyStack();
		int l = str.length();
		char c;

		for(int i=0;i<l;i++){
			ms1.push(str.charAt(i));
		}
		str = "";

		for(int i=0;i<l;i++){
			c = ms1.pop();

			if(c=='('){
				str += ')';
			}
			else if(c==')'){
				str += '(';
			}
			else{
				str += c;
			}
		}

		return str;
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