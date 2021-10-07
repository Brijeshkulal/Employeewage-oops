public class EmployeeWages {
	public static final int fullTime = 1;
	public static final int partTime = 2;
	
	String company;
	int wagePerHour;
	int workingDays;
	int maxHoursInMonth;
	
	public EmployeeWages(String company, int wagePerHour, int workingDays, int maxHoursInMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		EmployeeWages tcs = new EmployeeWages("TCS", 30 , 25, 120), maps = new EmployeeWages("Maps", 15 , 18, 80), google = new EmployeeWages ("Google", 50 , 20, 100);
		tcs.computeEmpWage();
		maps.computeEmpWage();
		google.computeEmpWage();
		
	}
		
	public int computeEmpWage() {
		int workingHour, totalEmployeeWage;
		int totalWorkingHour = 0;
		int totalWorkingDays = 0;
		while(totalWorkingHour <= maxHoursInMonth && totalWorkingDays < workingDays)
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck)
			{
				case 1:
				workingHour = 8;
				break;
				case 2:
				workingHour = 4;
				break;
				default:
				workingHour = 0;
			}
			totalWorkingHour += workingHour;
			totalWorkingDays++;
			System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " +totalWorkingHour);
		}
		totalEmployeeWage = totalWorkingHour * wagePerHour;
		System.out.println("Total Employee wages for "+ company + " : " +totalEmployeeWage);
		return totalEmployeeWage;
	}	
	
}