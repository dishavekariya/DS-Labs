import java.util.Scanner;

public class Array3XnumsAscending{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];

		System.out.println(get(a));
		
	}

	public static int get(int[] a){
		Scanner sc = new Scanner(System.in);

		int k=a[0],count=0;

		for(int i=1;i<a.length;i++){

			a[i] = sc.nextInt();

			if(a[i]==k){
				count++;
			}
			else if(count>=3 && a[i]>k){
				count=1;
				k=a[i];
			}
			else{
				return 0;
			}

			if(i==(a.length-1) && count<3){
				return 0; 
			}
		}
		return 1;

	}
}