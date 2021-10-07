public class EmployeeWages {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int fullTime = 1;
		int partTime = 2;
		int wagePerHour = 20;
		int workingDays = 20;
		int maxHoursInMonth = 100;
		int workingHour, totalEmployeeWage;
		int totalWorkingHour = 0;
		int totalWorkingDays = 0;
		while(totalWorkingHour <= maxHoursInMonth && totalWorkingDays < workingDays)
		{
			totalWorkingDays++;
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
			System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " +totalWorkingHour);
		}
		totalEmployeeWage = totalWorkingHour * wagePerHour;
		System.out.println("Total Employee wages " + totalEmployeeWage);
	}
}