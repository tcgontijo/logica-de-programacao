import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia, ptsEscolaridade = 0, ptsExperiencia;
		char viagem, cnh;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		System.out.println();
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		viagem = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		cnh = sc.next().charAt(0);
		
		if(escolaridade == 1) {
			ptsEscolaridade = 10;
		} else if(escolaridade == 2) {
			ptsEscolaridade = 20;
		} else if(escolaridade == 3) {
			ptsEscolaridade = 30;
		} else if(escolaridade == 4) {
			ptsEscolaridade = 40;
		}
		
		if(experiencia > 0 && experiencia <= 2) {
			ptsExperiencia = 10;
		} else if(experiencia > 2 && experiencia <= 5) {
			ptsExperiencia = 20;
		} else if(experiencia > 5) {
			ptsExperiencia = 40;
		} else {
			ptsExperiencia = 0;
		}
		
		System.out.println();
		System.out.println("Pontos por escolaridade: " + ptsEscolaridade);
		System.out.println("Pontos por experiência: " + ptsExperiencia);
		
		sc.close();
	}

}
