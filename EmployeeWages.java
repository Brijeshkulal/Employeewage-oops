public class EmployeeWages {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int fullTime = 1;
		int partTime = 2;
		int wagePerHour = 20;
		int workingDays = 20;
		int workingHour, empCheck , day, wagesPerday;
		int totalWages = 0;
		for(day=1;day<=workingDays;day++)
		{
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
			wagesPerday = workingHour * wagePerHour;
			totalWages = totalWages + wagesPerday;
		}
		System.out.println("Employee Wage per  month " + totalWages);
	}
}