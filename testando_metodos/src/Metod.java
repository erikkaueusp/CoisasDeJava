import java.util.Scanner;
import java.util.Locale;

public class Metod {
	/*
	 * Comentário rolando aqui
	 * 
	 */
	public static void main(String[] args) {

		double a, b, c;
// aqui também temos um comentário...		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite três números: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.printf("Os números são: " + a + ", " + b + " e " + c);

		System.out.print("\nO máximo entre eles é o número: " + maximo(a, b, c) + "\n");

		for (double i = 0; i < maximo(a, b, c); i++) {
			showResult();
		}

		sc.close();
	}

	public static double maximo(double x, double y, double z) {

		if (x > y && x > z) {
			return x;
		} else if (y > z) {
			return y;
		} else {
			return z;
		}

	}

	public static void showResult() {
		System.out.println("\nreturona somente texto....");
	}

}
