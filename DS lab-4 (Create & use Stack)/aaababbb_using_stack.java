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

public class aaababbb_using_stack{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyStack s1 = new MyStack();
		String str = sc.next();
		int l = str.length();

		for(int i=0;i<l;i++){
			char c = str.charAt(i);

			if(i<(l/2)){
				s1.push(c);
			}
			else if(c=='a'){
				s1.push('b');
			}
			else if(c=='b'){
				s1.push('a');
			}
		}

		String str2 = "";

		while(s1.getTop() != -1){
			str2 += s1.pop();
			
		}

		System.out.println(str2);					//just to diaplay resul strings
		System.out.println(getRevString(str2));

		if(str2.equals(getRevString(str2))){
			System.out.println("Valid string");
		}
		else
			System.out.println("Invalid string");
	}	

	public static String getRevString(String str){
		String ansString="";
		int l = str.length();

		for(int i=(l-1);i>-1;i--){
			ansString += str.charAt(i);
		}
		return ansString;
	}
}



