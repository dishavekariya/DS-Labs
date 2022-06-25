import java.util.Scanner;

public class ArrayElementAddition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n=3;

		int[][] ar = new int[n][n];
		double sum=0;

		System.out.println("Enter elements in 3*3 array");

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ar[i][j] = sc.nextInt();
				sum += ar[i][j];
			}
		}

		System.out.println(sum);

	}
}