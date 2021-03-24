package atv;

public class Ativo {
	
	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;
	

	public void Ativo(String nome, double preco, int quantidade, String tipo) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
		
	}
	
	public void Ativo() {		
	}
	
	public String getName() {
		return this.nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public double getPrice() {
		return this.preco;
	}
	public void setPrice(double preco) {
		this.preco = preco;
	}
	
	public int getQuantity() {
		return this.quantidade;
	}
	
	public void setQuantity(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getType() {
		return this.tipo;
	}
	
	public void setType(String tipo) {
		this.tipo = tipo;
	}
	
	public void addQuantity(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeQuantity(int quantidade) {
		if (this.quantidade >= 0) {
			this.quantidade -= quantidade;
		}
	}
	
	
}


