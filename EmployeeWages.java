public class EmployeeWages {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int Is_Present = 1;
		int wagePerHour = 20;
		int workingHour = 8;
		double Emp_Check = Math.floor(Math.random() * 10) % 2;
		if(Emp_Check == Is_Present)
		{
			System.out.println("Employee is present");
			System.out.println("Employee Wage per day is " + wagePerHour * workingHour);
		}
		else
    		{
      			System.out.println("Employee is absent");
    		}

	}
}