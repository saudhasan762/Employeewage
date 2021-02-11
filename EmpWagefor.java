
public class EmpWagefor {
	
	static final int IS_FULL_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	static final int IS_PART_TIME = 1;
	static final int NUMBER_OF_WORKING_DAYS = 2;

	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		int TotalempWage=0;
		for(int day = 0;day < NUMBER_OF_WORKING_DAYS;day++) {
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
			empWage= empHrs * EMP_RATE_PER_HOUR;
			TotalempWage +=empWage;
			System.out.println("Emp wage: " + empWage);
		}
		System.out.println("Total Emp wage: " + TotalempWage);
		
	}

	}


