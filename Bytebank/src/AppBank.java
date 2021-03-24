
public class AppBank {

	public static void main(String[] args) {
		Cliente p1 = new Cliente();
		Cliente p2 = new Cliente();
		
		p1.setIdade(30);
		p1.setNome("Erik");
		p1.setSexo("masculino");
		
		p2.setIdade(24);
		p2.setNome("Renata");
		p2.setSexo("feminino");
		
		System.out.printf("Nome: %s \n"
				+ "idade: %d \n"
				+ "sexo: %s",p1.getNome(),p1.getIdade(),p1.getSexo());
		System.out.println("\n");
		
		System.out.printf("Nome: %s \n"
				+ "idade: %d \n"
				+ "sexo: %s",p2.getNome(),p2.getIdade(),p2.getSexo());
		
		Conta c1 = new Conta(p1);
		Conta c2 = new Conta(p2);
		
		
		
		
		int numeroDeContas = Conta.many();
		
		System.out.println("\n\nTotal De Contas: " + numeroDeContas);
		
		
		System.out.println("\n\n Conta p1: " + c1.cliente.getNome() + 
				"\n Conta p2: " + c2.cliente.getNome() );

	}

}
