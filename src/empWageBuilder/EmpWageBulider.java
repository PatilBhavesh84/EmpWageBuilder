package empWageBuilder;

public class EmpWageBulider {

	public static void main(String[] args) {
		int PRESENT=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==PRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}
