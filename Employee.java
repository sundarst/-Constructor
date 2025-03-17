package constructor;
import java.util.*;
public class Employee {
	private static long EmployeId;
	private  static String EmployessName;
	private  static String EmployeeSalary;
	
	Employee(long EmployeId,String EmployessName,String EmployeeSalary)
	{
		Employee.EmployeId=EmployeId;
		Employee.EmployessName=EmployessName;
		Employee.EmployeeSalary=EmployeeSalary;
	}
	public void displayAll()
	{
		System.out.println("EId:"+EmployeId+" EName:"+EmployessName+" ESalary:"+EmployeeSalary+"Rs");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employee");
		int size=scan.nextInt();
		Employee[] employeeArr=new Employee[size];		
		for(int i=0;i<size;i++)
		{
			employeeArr[i]=new Employee(EmployeId,EmployessName,EmployeeSalary);
			System.out.println("Employe Id");
			EmployeId=scan.nextInt();
			System.out.println("Employe Name");
			EmployessName=scan.next();
			System.out.println("Employee Salary");
			EmployeeSalary=scan.next();
		}
		
		System.out.println("List of employess");
		
		for(Employee emp:employeeArr)
		{
			emp.displayAll();
		}
	}

}
