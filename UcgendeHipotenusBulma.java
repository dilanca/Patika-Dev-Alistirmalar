package java101PatikaDev;
import java.util.Scanner;

public class UcgendeHipotenusBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��geninizin ilk kenar�n� giriniz");
		a = scanner.nextInt();
		System.out.println("��geninizin ikinci kenar�n� giriniz");
		b = scanner.nextInt();
		
		c= Math.sqrt((a*a)+(b*b));
		
		System.out.println("��geninizin hipoten�s� : " + c);
		
		
		
		
		
		
		
		
		
	}

}
