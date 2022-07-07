package empWageBuilder;

public class EmpWageBulider {

	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;

	public static void main(String[] args) {

		int empHr=0;
		int empWage=0; 

		int empCheck=(int)Math.floor(Math.random()*10)%3;

		switch(empCheck)
		{
		case PART_TIME:
			empHr=4;
			System.out.println("part time");
			break;

		case FULL_TIME:
			empHr=8;
			System.out.println("full time");
			break;

		default:
			empHr=0;
			System.out.println("absent");




			empWage=empHr*PER_HOUR;
			System.out.println("Employee wage-" +empWage);
		}
	}
}
