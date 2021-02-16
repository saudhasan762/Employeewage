
public class EmployeeWageUsingMethod {
	static final int IS_FULL_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	static final int IS_PART_TIME = 1;
	static final int NUMBER_OF_WORKING_DAYS = 20;
	static final int MAX_HOURS_IN_MONTH = 100;
	
	public static void main(String[] args) {
		int TotalempWage = CalEmpWage(0,0,0,0,0);
		System.out.println("Total Emp wage: " + TotalempWage);	
	}
	
	public static int CalEmpWage(int FinalempWage, int EmpWage, int Totalworkingdays, int EmpHrs, int TotalEmpHrs) {
		int empHrs=0;
		int empWage=0;
		while(TotalEmpHrs <= MAX_HOURS_IN_MONTH && Totalworkingdays < NUMBER_OF_WORKING_DAYS) {
			Totalworkingdays++;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			TotalEmpHrs +=empHrs;
			empWage= empHrs * EMP_RATE_PER_HOUR;	
			System.out.println("Emp wage: " + empWage);
			FinalempWage +=empWage;
		}
		return FinalempWage;	
	}
}
