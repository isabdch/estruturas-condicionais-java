import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.print(num + " é par.");
		} else {
			System.out.print(num + " é ímpar.");
		}
		
		sc.close();
	}

}
