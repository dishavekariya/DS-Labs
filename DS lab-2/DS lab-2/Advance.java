import java.util.Scanner;

public class Advance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] ar1 = new int[3][2];
		int[][] ar2 = new int[2][3];
		int[][] ar3 = new int[3][3];
		int[][] ar4 = new int[3][4];
		int[][] ar5 = new int[3][4];


		System.out.println("Enter two matrix : 3*2 and 2*3");

		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				ar1[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				ar2[i][j]=sc.nextInt();
			}
		}


		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				int temp =0;

				for(int k=0;k<2;k++){
					temp = temp+ ar1[i][k]*ar2[k][j];
				}

				ar3[i][j] = temp; 
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ar3[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("enter 3*4 matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				ar4[i][j]=sc.nextInt();
			}
		}

		

		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				int temp =0;

				for(int k=0;k<3;k++){
					temp = temp+ ar3[i][k]*ar4[k][j];
				}

				ar5[i][j] = temp; 
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ar5[i][j] + " ");
			}

			System.out.println();
		}


	}
	
}