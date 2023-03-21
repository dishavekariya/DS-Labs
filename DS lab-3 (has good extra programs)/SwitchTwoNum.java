public class SwitchTwoNum{
	static int x=10,y=20;

	public static void main(String[] args) {
		
		myswitch(x,y);
		System.out.println(x+" "+y);
	}
	public static void myswitch(int a,int b){
		int temp = a;
		x=b;
		y=temp;
	}
}