package projects_oopsProject;

public abstract class Emp {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary > this.salary)
			this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	private String name;
	private double salary;
	private String designation;
		static int eid;
		public Emp(String name, double salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.eid = ++eid;
	}
	public static int getEid() {
			return eid;
		}
		public static void setEid(int eid) {
			Emp.eid = eid;
		}
	public abstract void work();
	
		
}
