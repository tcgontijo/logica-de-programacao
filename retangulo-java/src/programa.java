import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float largura, altura, perimetro, area;
		int opcao, teste = 0;

		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextFloat();
				
		while (largura < 1) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextFloat();
		}

		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextFloat();		

		while (altura < 1) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextFloat();
		}
		
		while (teste == 0) {
			
		System.out.println();
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opcao: ");
		opcao = sc.nextInt(); 
		
		if (opcao == 1) {
			area = largura * altura;
			System.out.println();
			System.out.println("AREA = " + area);
		} else if (opcao == 2){
			perimetro = (largura * 2) + (altura * 2);
			System.out.println();
			System.out.println("PERIMETRO = " + perimetro);
		} else if (opcao == 3) {
			teste = 1;
		} else {		
			System.out.println();
			System.out.println("OPÇÃO INVALIDA");
		}
		
		}
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}
