import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.println("Uma operadora cobra R$50.00 por até 100 minutos de telefone. A partir disso,");
		System.out.println("por cada minuto a mais é cobrado R$2.00. Informe a quantidade de minutos que o consumidor usou: ");
		
		minutos = sc.nextInt();
		
		if (minutos > 100) {
			conta += ((minutos - 100) * 2.0);
		}
		
		System.out.printf("A conta total foi de R$%.2f.", conta);
		
		sc.close();
	}

}
