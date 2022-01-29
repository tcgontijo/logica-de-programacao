package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;
		int qtdCerverja, qtdRefri, qtdEspeto;
		double ingresso, couvert, consumo;

		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		qtdCerverja = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		qtdRefri = sc.nextInt();
		System.out.print("Quantidade de espeto: ");
		qtdEspeto = sc.nextInt();
		
		consumo = (qtdCerverja * 5) + (qtdEspeto * 7) + (qtdRefri * 3);

		if (sexo == 'F' || sexo == 'f') {
			ingresso = 8;
		} else {
			ingresso = 10;
		}
		if (consumo >= 30) {
			couvert = 0;
		} else {
			couvert = 4;
		}

		System.out.println("\nRELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (couvert == 0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", couvert);
		}
		System.out.printf("Ingresso = R$ %.2f%n%n", ingresso);
		System.out.printf("Valor a pagar = R$ %.2f%n", (consumo + couvert + ingresso));


		sc.close();

	}

}
