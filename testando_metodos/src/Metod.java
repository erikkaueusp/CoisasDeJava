import java.util.Scanner;
import java.util.Locale;

public class Metod {
	/*
	 * Coment�rio rolando aqui
	 * 
	 */
	public static void main(String[] args) {

		double a, b, c;
// aqui tamb�m temos um coment�rio...		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite tr�s n�meros: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.printf("Os n�meros s�o: " + a + ", " + b + " e " + c);

		System.out.print("\nO m�ximo entre eles � o n�mero: " + maximo(a, b, c) + "\n");

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
