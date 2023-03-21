//Prefix expresion is given saperate by space
//So that number can be of two digits

import java.util.Scanner;
import java.lang.String;

public class Evaluation_of_prefix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyStack s1 = new MyStack();

		System.out.println("Enter the prefix expresion separated by space");
		String str = sc.nextLine();

		String[] prefix = str.split(" ");
		int l = prefix.length;

		for(int i=(l-1);i>-1;i--){
			if(isNumeric(prefix[i])){
				s1.push(Integer.parseInt(prefix[i]));
			}
			else{
				int num1 =s1.pop();
				int num2 = s1.pop();
				int ans;
				switch(prefix[i]){
				case "+" :{
					ans = num1 + num2;
					break;
				}
				case "-" :{
					ans = num1 - num2;
					break;
				}
				case "*" :{
					ans = num1 * num2;
					break;
				}
				case "/" :{
					ans = num1 / num2;
					break;
				}
				default :{
					ans = 0;
					break;
				}
				}
				s1.push(ans);
			}
			
		}
		System.out.println("ans = "+ s1.pop());
	}

	public static boolean isNumeric(String num){
		try{
			double n = Double.parseDouble(num);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
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
			System.out.println("Sack is empty");
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