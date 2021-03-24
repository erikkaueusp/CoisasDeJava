import java.util.Locale;
import java.util.Scanner;

import intest.Product;
import intest.Triangle;

public class testclass {

	public static void main(String[] args) {
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		x.a = 3;
		x.b = 4;
		x.c = 5;
		
		y.a = 6;
		y.b = 8;
		y.c = 10;
		
		System.out.println(x.a+" , "+x.b);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.printf("Product data: %s $%.2f %d units, Total: $%.2f ",product.name,product.price,product.quantity,product.TotalValueInStock());
		
		sc.close();
		
	}

}
