import java.util.Scanner;

public class SeconfLargestInArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int[] a = new int[n];

		a[0] = sc.nextInt();
		int max1=Integer.MIN_VALUE;
		int max2=a[0];

		for(int i=1;i<n;i++){
			a[i] = sc.nextInt();

			if(a[i]>max2){
				max1 = max2;
				max2 = a[i];
			}
			else if(a[i]>max1){
				max1=a[i];
			}
		}
		System.out.println(max1);
	}
}