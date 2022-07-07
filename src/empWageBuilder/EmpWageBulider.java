package empWageBuilder;

public class EmpWageBulider {

	public static void main(String[] args) {
		int PART_TIME=1;
		int FULL_TIME=2;
		int PER_HOUR=20;

		int empHr=0;
		int empWage=0; 

		double empCheck=Math.floor(Math.random()*10)%3;

		if(empCheck==PART_TIME)
			empHr=4;
		else if(empCheck==FULL_TIME)
			empHr=8;
		else
			empHr=0;

		empWage=empHr*PER_HOUR;
		System.out.println("Employee wage-" +empWage);
	}

}
