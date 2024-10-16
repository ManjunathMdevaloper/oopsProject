package projects_oopsProject;

public class Te extends Emp{
	static int teCoutn =0 ;

	public Te(String name, double salary, String designation) {
		super(name, salary, designation);
		teCoutn++;
	}

	@Override
	public void work() {
		System.out.println(getName()+" is Testing...");
	}

}
