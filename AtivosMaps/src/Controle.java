import atv.Ativo;


public class Controle {

	public static void main(String[] args) {
		Ativo ativo = new Ativo();
		
		ativo.setName("Casa");
		ativo.setPrice(25.45);
		ativo.addQuantity(10);
		ativo.setType("RF");
		
		System.out.printf("Ativos: " + ativo.getName() + ", Preço: R$" + ativo.getPrice() + 
				", Quantidade: " + ativo.getQuantity()+ ", Tipo: " + ativo.getType());
		

	}

}
