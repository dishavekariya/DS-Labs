import java.util.Scanner;

public class PrimeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number to check whether it's prime or not");
		int n = sc.nextInt();
		boolean flag = true;

		for(int i=2;i<=(n/2);i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}

		if(flag)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}