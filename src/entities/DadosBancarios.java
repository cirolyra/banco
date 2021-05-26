package entities;

public class DadosBancarios {

	private int numConta;
	private String titConta;
	private double saldo;

	public DadosBancarios() {

	}

	public DadosBancarios(int numConta, String titConta) {
		this.numConta = numConta;
		this.titConta = titConta;

	}

	public DadosBancarios(int numConta, String titConta, double saldo) {
		this.numConta = numConta;
		this.titConta = titConta;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitConta() {
		return titConta;
	}

	public void setTitConta(String titConta) {
		this.titConta = titConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposit(double value) {
		this.saldo += value;
	}

	public void withdraw(double value) {
		this.saldo -= value + 5.00;
	}

	public String toString() {
		return "Account: " 
				+ getNumConta() 
				+ ", Holder: " 
				+ getTitConta() 
				+ ", Balance: $ "
				+ String.format("%.2f", getSaldo());
	}
}
