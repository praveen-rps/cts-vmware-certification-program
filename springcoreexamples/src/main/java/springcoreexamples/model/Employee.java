package springcoreexamples.model;



public class Employee {
	
	int empid;
	String name;
	String department;
	public Employee() {
		empid=1001;
		name="Kishore";
		department="Finance";
	}
	public Employee(int empid, String name, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
		public void setDepartment(String department) {
			this.department = department;
		}
}
