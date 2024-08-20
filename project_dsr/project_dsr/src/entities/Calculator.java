package entities;


public class Calculator {
	private double comissao;
	
	public Calculator(double comissao) {
		this.comissao = comissao;
	}
	
	public void setComissao(double comissao) {
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public double calcDsr(double comissao) {
		return (12.903* comissao) / 100;
	}
	public double sub(double comissao) {
		return getComissao() - calcDsr(comissao) ;
	}
	public String toString() {
		return "DSR ------------> R$ "
			+ String.format("%.2f%n", calcDsr(comissao))
			+ "COMISSÃO -------> R$ "
			+ String.format("%.2f%n", sub(comissao))
			+ "VALOR BRUTO ----> R$ "
			+ String.format("%.2f%n",getComissao());
	}
}
