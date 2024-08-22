package application;
import people.*;

import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		Employee[] emp = new Employee[2];
		
		
		for (int i=0; i<emp.length; i++) {
			System.out.println("Enter the data from Employe: ");
			System.out.print("Name: ");
			String fullName = input.nextLine();
			System.out.print("Age: ");
			int age = input.nextInt();
			System.out.print("CPF: ");
			input.nextLine();
			String cpf = input.next();
			System.out.print("Job: ");
			input.nextLine();
			String job = input.nextLine();
			
			emp[i] = new Employee(fullName, age, cpf, job);
			
			System.out.println("--------Cadastro Realizado!-------");
			
			switch(job) {
			case "Manager":
				Manager manager = new Manager(fullName, age, cpf, job);
				System.out.printf("Salary with discount: R$ %.2f%n",manager.getSalary());
				break;
			case "Administrative Assistant":
				AdmAssistant assistant = new AdmAssistant(fullName, age, cpf, job);
				System.out.printf("Salary with discount: R$ %.2f%n", assistant.getSalary());
				break;
			case "Trainee":
				Trainee trainee = new Trainee(fullName, age, cpf, job);
				System.out.printf("Salary with discount: R$ %.2f%n", trainee.getSalary());
				break;
			default:
				Employee employee = new Employee(fullName, age, cpf, job);
				System.out.printf("Salary with discount: R$ %.2f%n", employee.getSalary());
				break;
			}
			
			System.out.println("==============================");
		}
		
		input.close();
	}

}
