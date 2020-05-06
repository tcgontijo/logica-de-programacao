package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;
		int qtdCerverja, qtdRefri, qtdEspeto;

		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		qtdCerverja = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		qtdRefri = sc.nextInt();
		System.out.print("Quantidade de espeto: ");
		qtdEspeto = sc.nextInt();

		sc.close();

	}

}
