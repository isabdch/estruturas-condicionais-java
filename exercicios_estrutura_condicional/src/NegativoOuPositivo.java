import java.util.Scanner;

public class NegativoOuPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número para saber se ele é negativo ou não: ");

		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.print("O número " + numero + " é positivo.");
		} else {
			System.out.print("O número " + numero + " é negativo.");
		}

		sc.close();
	}

}
