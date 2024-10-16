package projects_oopsProject;

public class Hr extends Emp{
	static int hrCount=0;
	public Hr(String name, double salary, String designation) {
		super(name, salary, designation);
		hrCount++;
}
	@Override
	public void work() {
		System.out.println(getName()+" is Hiring....!");
	}

}
