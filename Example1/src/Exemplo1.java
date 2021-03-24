import java.util.Locale;
import java.util.Scanner;

import Banks.Conta;

public class Exemplo1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int account;
		String name;
		double value;
		char choose;
		
		System.out.print("Enter account number: ");
		
		account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.next();
		name = sc.nextLine();
		
		Conta conta = new Conta(account,name);
		
		System.out.print("Is there an initial deposit (y/n)? ");
		
		choose = sc.next().charAt(0);
		
		
		if (choose == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			conta.deposito(value);
			
		}
		
		System.out.println("Account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: %.2f\n\n",conta.getNumberAcc(), conta.getName(),conta.getValue());
		
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		conta.deposito(value);
		
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: %.2f\n\n",conta.getNumberAcc(), conta.getName(),conta.getValue());
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		conta.saque(value);
		
		System.out.println("Updated account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: %.2f\n\n",conta.getNumberAcc(), conta.getName(),conta.getValue());
		sc.close();
	}

}
