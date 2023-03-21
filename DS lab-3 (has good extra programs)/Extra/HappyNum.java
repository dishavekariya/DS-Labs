import java.util.Scanner;

public class HappyNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int temp = 0;
		int[] a = new int[100];
		a[0] = n;
		int k=0;
		temp =0;
		boolean flag=true;

		while(n!=1){

			while(n>=1){
				temp += (n%10)*(n%10);
				n/=10;
			}
			k++;
			a[k]=temp;
			n= temp;
			temp=0;
			System.out.print(n + " ");

			for(int j=1;j<=k;j++){
				if(a[j-1]==n){
					System.out.println("\nnum is not Happy");
					flag=false;
					break;
				}
			}
			if(flag==false){
				break;
			}
		}
		if(flag==true){
			System.out.println("\nnum is Happy");
		}





	}
}