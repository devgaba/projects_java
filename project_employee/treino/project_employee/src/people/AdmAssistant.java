package people;



public class AdmAssistant extends Employee {
	
	
	private static double salary = 1500.00;
	
	public AdmAssistant(String fullName, int age, String cpf, String job) {
		super(fullName, age, cpf, job);
		}
	
	public double getSalary() {
		double newSalary = salary - ((salary * 7.5)/100);
		return newSalary;
		
		
	}
	}
	
