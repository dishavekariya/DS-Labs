import java.util.Scanner;

public class FactorialLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find it's factorial");
		int n = sc.nextInt();

		int temp=1;
		for(int i=1;i<=n;i++){
			temp=temp*i;
		}

		System.out.println(temp);
	}
}