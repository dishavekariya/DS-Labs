import java.util.Scanner;

public class FactorialRecursion{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial");
		int n= sc.nextInt();

		Tool t = new Tool();

		System.out.println(t.getFactorial(n));
	}
}

class Tool{
	public int getFactorial(int n){
		if(n==1)
			return 1;
		else
			return n*getFactorial(n-1);
	}
}