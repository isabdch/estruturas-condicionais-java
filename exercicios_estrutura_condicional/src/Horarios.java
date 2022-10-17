import java.util.Scanner;

public class Horarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.print("Informe que horas são: ");

		hora = sc.nextInt();

		if (hora >= 5 && hora <= 12) {
			System.out.print("Bom dia!");
		} else if (hora < 18) { 
			System.out.print("Boa tarde!");
		} else {
			System.out.print("Boa noite!");
		}
		
		sc.close();
	}

}
