package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("===========ÍNICIO============");
		System.out.print(" Digite o valor bruto: ");
		double comissao = input.nextDouble();
		
		Calculator calculator = new Calculator(comissao);
		
		System.out.println("=============================");
		System.out.println(calculator);
		
		input.close();
	}

}
