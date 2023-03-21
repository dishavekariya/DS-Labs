import java.util.Scanner;

public class EmployeeDetails{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employee_id;
		String name;
		int designation;
		float salary;
		System.out.println("Employee id : ");
		employee_id = sc.nextInt();
		System.out.println("Name : ");
		name = sc.next();
		System.out.println("Designation : ");
		designation = sc.nextInt();
		System.out.println("Salary : ");
		salary = sc.nextFloat();

		System.out.println(employee_id+" "+name+" "+designation+" "+salary);
	}
}