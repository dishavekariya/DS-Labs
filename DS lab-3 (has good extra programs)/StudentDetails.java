import java.util.Scanner;

class StudentDetailsClass{
	int enrollment_no;
	String name;
	int sem;
	float cpi;

	public void getDetails(int enrollment_no,String name,int sem,float cpi){
	this.enrollment_no = enrollment_no;
	this.name = name;
	this.sem = sem;
	this.cpi = cpi;
	}
	public String toString(){
		return enrollment_no+" "+ name+" "+ sem +" "+ cpi;
	}
}

public class StudentDetails{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDetailsClass[] s = new StudentDetailsClass[5];

		for(int i=0;i<5;i++){
			s[i] = new StudentDetailsClass();
			 s[i].getDetails(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat());
		}
		for(int i=0;i<5;i++){
			System.out.println(s[i]);
		}
	}
}