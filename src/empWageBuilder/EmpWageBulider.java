package empWageBuilder;

public class EmpWageBulider {

	public static void main(String[] args) {
		int PRESENT=1;
		int PER_HOUR=20;

		int empHr=0;
		int empWage=0; 
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==PRESENT)
			empHr=8;
		else
			empHr=0;

		empWage=empHr*PER_HOUR;
		System.out.println("Employee wage-" +empWage);
	}

}
