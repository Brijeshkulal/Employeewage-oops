public class EmployeeWages {
	public static final int fullTime = 1;
	public static final int partTime = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		computeEmpWage("TCS", 30 , 25, 120);
		computeEmpWage("Maps", 15 , 18, 80);
		computeEmpWage("Google", 50 , 20, 100);
	}
		
	public static int computeEmpWage(String company, int wagePerhour, int workingDays, int maxHoursInMonth) {
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