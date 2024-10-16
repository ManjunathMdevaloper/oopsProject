package projects_oopsProject;

public class Dev extends Emp{

	static int devCount=0; 
	public Dev(String name, double salary, String designation) {
		super(name, salary, designation);
		devCount++;
	}
	@Override
	public void work() {
		System.out.println(getName()+" is Coding");
		
	}

}
