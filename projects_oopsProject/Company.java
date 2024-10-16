package projects_oopsProject;

public class Company 
{
	static void display(Emp e)
	{
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Designstion is "+e.getDesignation());
		System.out.println("Eid is "+e.getEid());
		System.out.println("--------------");

	}
	public static void main(String[] args) {
		Dev d1=new Dev("Raj Kumar",20000,"sr dev");
		Dev d2 = new Dev("Manjunath",30000,"sr Dev");
		Te t1 = new Te("Jayanth",20000,"jr Te");
		Te t2 = new Te("Surendra",25000,"Sr TE");
		Hr h = new Hr("Raghav",18000, "Hr Manager");
		
		Emp em[] = {d1,d2,t1,t2,h};
		for(int i=1;i<em.length;i++)
		{
			display(em[i]);
		}
			System.out.println("Count of Dev is "+Dev.devCount);
			System.out.println("Count of Te is "+Te.teCoutn);
			System.out.println("Count of Hr is "+Hr.hrCount);
		
			
	}
}
