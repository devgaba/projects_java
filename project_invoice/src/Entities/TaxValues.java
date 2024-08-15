package Entities;

public class TaxValues {
	private double value;
	
	
	
	public TaxValues(double value) {
		this.value = value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double calcPis(double value) {
		return (value * 0.65)/100;
	}
	public double calcCof(double value) {
		return (value *3.00)/100;
	}
	public double calcIr(double value) {
		return (value * 1.50)/100;
	}
	public double calcCsl(double value) {
		return (value * 1.00)/100;
	}
	
	public String toString() {
		return "PIS: "
			+ String.format("%.2f%n", calcPis(value))
			+ "COFINS: "
			+ String.format("%.2f%n", calcCof(value))
			+ "IRRF: "
			+ String.format("%.2f%n", calcIr(value))
			+ "CSLL: "
			+ String.format("%.2f%n", calcCsl(value));
	}
}
