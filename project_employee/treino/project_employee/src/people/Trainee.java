package people;

public class Trainee extends Employee {
	
	private static double salary = 1000.00;
	
	public Trainee (String fullName, int age, String cpf, String job){
		super(fullName,age,cpf,job);
			
	}
	
	public double getSalary() {
		double newSalary = salary - ((salary * 4.5)/100);
		return newSalary;
		
	}
	
}
