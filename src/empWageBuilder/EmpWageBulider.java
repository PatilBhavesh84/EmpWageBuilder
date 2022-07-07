package empWageBuilder;

public class EmpWageBulider {

	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;
	public static final int WORKING_DAYS=20;
	public static void main(String[] args) {

		int totalWage=0;
		int empHr=0; 
		for(int day=1;day<=WORKING_DAYS;day++)
		{

			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck)
			{
			case PART_TIME:
				empHr=4;

				break;

			case FULL_TIME:
				empHr=8;

				break;

			default:
			}

			int wage=empHr*PER_HOUR;
			System.out.println("On day-"+day+"-wage is-"+wage);
			totalWage += wage;
			System.out.println("Total wage for a month is-" +totalWage);
		}
	}
}
