package testando;
import java.util.Locale;
public class PrimeiroPrograma {
	
	public static void main(String[] args) {
	System.out.println("testando...");
	
	String product1 = "Computer";
	String product2 = "Office Desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products:");
	System.out.printf("%s, which price is $ %.2f %n",product1,price1);
	System.out.printf("%s, which price is $ %.2f\n\n",product2,price2);
	System.out.printf("Record: %d years old, code %d and gender %s\n\n",age,code,gender);
	System.out.printf("Measure with eight decimal places: %.8f\n",measure);
	System.out.printf("Rouded (three decimal places): %.3f\n",measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f",measure);

	


	
	}
	 public void method1() {
		int x = 10;
		if (x > 10) {
			int y = 20;
		}
		System.out.println(x);
		// System.out.println(y); AQUI DA ERRO PORQUE O Y SÓ EXISTE NO ESCOPO DO IF!
	 }
}
 