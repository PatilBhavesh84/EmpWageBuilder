package empWageBuilder;

public class EmpWageBulider {

	public static void main(String[] args) {
		int empRatePerHour = 20;
		int salary;
		int empHrs;
		int totalSalary = 0;
		int totalWorkingdays = 0,totalEmpHrs = 0; 


		while(totalEmpHrs <= 100 && totalWorkingdays <=20)
		{
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
			{
			case 1:
				empHrs = 8;
				break;
			case 2: 
				empHrs = 4;
			
				break;
			default:
				empHrs =0;
			}
			salary = empRatePerHour*empHrs;
			totalSalary = totalSalary + salary;
			totalEmpHrs = totalEmpHrs + empHrs;
			totalWorkingdays++;
		}
		System.out.println("Monthly wage is " + totalSalary);
	}


}

