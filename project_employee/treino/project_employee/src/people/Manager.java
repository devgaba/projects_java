package people;

public class Manager extends Employee{

	private static double salary = 10000.00;
	
	public Manager(String fullName, int age, String cpf, String job) {
		super(fullName, age, cpf, job);
		
	}
	
	public double getSalary() {
		double newSalary = salary - ((salary * 13.5)/100);
		return newSalary;
		
		
	}
	
}
