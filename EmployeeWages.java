public class EmployeeWages {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int fullTime = 1;
		int partTime = 2;
		int wagePerHour = 20;
		int workingHour;
		double Emp_Check = Math.floor(Math.random() * 10) % 3;
		if(Emp_Check == fullTime)
		{
			System.out.println("Employee is present");
			workingHour = 8;
		}
		else if(Emp_Check == partTime)
		{
			System.out.println("part time employee is present");
			workingHour = 4;
		}
		else
		{
			System.out.println("Employee is absent");
			workingHour = 0;
		}
		System.out.println("Employee Wage per day is " + wagePerHour * workingHour);
	}
}