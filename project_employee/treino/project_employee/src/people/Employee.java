package people;


public class Employee {
	
	
	private String fullName;
	private int age;
	private String cpf;
	private String job;
	
	private static double salaryEmployee = 700.00;
	
	public double getSalary() {
		return salaryEmployee;
	}
	public Employee(String fullName, int age, String cpf, String job) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.cpf = cpf;
		this.job = job;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String toString() {
		return "Name: "
			+ getFullName() +"\n"
			+ "Age: "
			+ getAge() +"\n"
			+ "CPF: "
			+ getCpf() +"\n"
			+ "Job: "
			+ getJob() + "\n";
	}
}
