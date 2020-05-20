import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float largura = 0, altura = 0;

		System.out.print("Digite a largura do retangulo: ");

		while (largura < 1) {
			largura = sc.nextFloat();
			if (largura < 1) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
			}
		}

		System.out.print("Digite a altura do retangulo: ");

		while (altura < 1) {
			altura = sc.nextFloat();
			if (altura < 1) {
				System.out.print("O valor deve ser positivo. Tente novamente: ");
			}
		}
		sc.close();
	}

}
