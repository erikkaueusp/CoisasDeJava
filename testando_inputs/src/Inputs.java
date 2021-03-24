import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		
		String x;
		int y;
		double z;
		String w;
		Scanner variavel = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		x = variavel.next();
		y = variavel.nextInt();
		z = variavel.nextDouble();
		w = sc.next();
		System.out.println("Você digitou o valor:" + x + y);
		System.out.println(z);
		System.out.println(w);
		
		sc.close();
		variavel.close();

	}

}
