package Banks;

public class Conta {
	private String name;
	private double value;
	private int numberAcc;
	
	public Conta(int numberCount,String name) {
		this.numberAcc = numberCount;
		this.name = name;
	}
	
	public Conta(int numberCount,String name, double value) {
		this.numberAcc = numberCount;
		this.name = name;
		this.value = value;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumberAcc() {
		return this.numberAcc;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void deposito(double value) {
		this.value += value;
	}
	
	public void saque(double value) {
		this.value -= (value + 5.0);
	}
	
	
	
	

}
