import java.util.Scanner;

public class DigitsInNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(Tool.getCountOFDigits(num));

	}
}

class Tool{
	public static int getCountOFDigits(int n){
		if(n<1)
			return 0;
		else
			return 1+getCountOFDigits(n/10);
	}
}