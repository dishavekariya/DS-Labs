import java.util.Scanner;

public class Clock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double h = sc.nextInt();
		double hm = h*5;

		double min = sc.nextInt();

		double little_diff = (min/60)*5;

		hm = hm+little_diff; 

		double angle;

		if(hm<min){
			angle = (min-hm)*6;
		}
		else{
			min = min+60;
			angle = (min-hm)*6;
		}

		if(angle>180)
			angle=360-angle;

		System.out.println(angle);



	}
}