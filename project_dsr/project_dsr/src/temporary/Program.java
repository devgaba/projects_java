package temporary;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("===========ÍNICIO============");
		System.out.print(" Digite o valor bruto: ");
		double comissao = input.nextDouble();
		
		System.out.printf("DSR ------------> R$ %.2f%n", Calculator(comissao));
		System.out.printf("COMISSÃO -------> R$ %.2f%n", sub(comissao));
		System.out.printf("VALOR BRUTO ----> R$ %.2f%n", comissao);
		
		System.out.println("=============================");
		
		input.close();
	}
	
	public static double Calculator(double comissao) {
		return (21.7749* comissao)/ 100;
	}
	public static double sub(double comissao) {
		return comissao - Calculator(comissao);
	}

}
