package java101PatikaDev;
import java.util.Scanner;

public class UcgendeHipotenusBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üçgeninizin ilk kenarýný giriniz");
		a = scanner.nextInt();
		System.out.println("Üçgeninizin ikinci kenarýný giriniz");
		b = scanner.nextInt();
		
		c= Math.sqrt((a*a)+(b*b));
		
		System.out.println("Üçgeninizin hipotenüsü : " + c);
		
		
		
		
		
		
		
		
		
	}

}
