
public class Conta {
	private double saldo;
	private int numero;
	Cliente cliente;
	private static int contador;
	
	public Conta() {
		
	}
	
	public Conta(Cliente cliente) {
		contador++;
		this.cliente = cliente;
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static int many() {
		return contador;
	}
	
	

}
