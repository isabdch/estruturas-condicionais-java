import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, saoMultiplos;

		System.out.print("Informe dois números para saber se o primeiro seria múltiplo ou não do segundo: ");
		// OBS.: os números podem ser digitados em ordem crescente ou decrescente e isso não deverá afetar o resultado.

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			saoMultiplos = num1 % num2;
		} else {
			saoMultiplos = num2 % num1;
		}

		if (saoMultiplos == 0) {
			System.out.print("São múltiplos.");
		} else {
			System.out.print("Não são múltiplos.");
		}

		sc.close();
	}

}
