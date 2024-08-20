package Program;
import java.util.Locale;
import java.util.Scanner;
import Entities.TaxValues;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of invoice: ");
		double value = input.nextDouble();
		
		TaxValues calc_tax = new TaxValues(value);
		System.out.println("=======================");
		System.out.println(calc_tax);
		input.close();
	}

}
