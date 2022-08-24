package test;

 class Employee
{
	int empId;
	String empName;
	double empSalary;
	
	Employee(int empId,String empName,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	void display()
	{
		System.out.println(this.empId + " "+this.empName + " "+this.empSalary);
	}
	
}


public class ThisKeywordTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee(555,"MS.SHIVAREKKA",500000);
		employee.display();

	}

}

	


