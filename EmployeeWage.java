
public class EmployeeWage {
	private static final int isFullTime = 1;
	private static final int isPartTime = 2;

	private int numOfCompany=0;
	private CompanyEmployeeWage[] companyEmpWageArray;

	public EmployeeWage(){
		companyEmpWageArray = new CompanyEmployeeWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numbOfCompany, int numOfWorkingDays, int maxHoursPerMonth) {
	companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	computeEmpWage(companyEmpWageArray[numOfCompany].company, companyEmpWageArray[numOfCompany].empRatePerHour,
			companyEmpWageArray[numOfCompany].numOfWorkingDays ,companyEmpWageArray[numOfCompany].maxHoursPerMonth);
	numOfCompany++;
	}

	public static int computeEmpWage(String company, int empRate, int numOfDays, int maxHours){
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int empWage = 0;
		int totalempWage = 0;
		while(totalEmpHrs <= maxHours && totalWorkingDays < numOfDays) {
			totalWorkingDays++;
			int empHrs=0;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case isFullTime:
					empHrs=8;
					break;
				case isPartTime:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs +=empHrs;
			empWage = totalEmpHrs * empRate;
			System.out.println("Employee wage for Day "+totalWorkingDays+" is "+empWage);
			totalempWage= empWage + totalempWage;
		}
		System.out.println("Total Employee wage for Company: " +company+ " is " +totalempWage);
		return totalempWage;
	}
	public static void main(String[] args) {
	EmployeeWage emp = new EmployeeWage();
	emp.addCompanyEmpWage("Reliance Digital", 10, 2, 5, 40 );
	emp.addCompanyEmpWage("D-mart", 10, 3, 8, 30);
	}
}

