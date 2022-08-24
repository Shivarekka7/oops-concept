package test;

public class employee {
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	private double annualsalary;
	private double raisesalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualsalary() {
		return salary*12;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public double getRaisesalary() {
		return salary+(salary*.1);
	}
	public void setRaisesalary(double raisesalary) {
		this.raisesalary = raisesalary;
	}
	public 
	@Override
	public String toString() {
		return "Salary2 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", annualsalary=" + annualsalary + ", raisesalary=" + raisesalary + "]";
	}
	

}
{
	public static void main(String args[]) {
		Employee emp=new Employee()
}
