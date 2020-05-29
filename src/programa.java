import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, maisRico = "a";
		char rep;
		int horas, somaHoras = 0;
		double valorHora, somaValor = 0, salario, maiorSalario = 0;
		
		do {	
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		while(horas <= 0) {
			System.out.print("Insera um valor positivo para Horas trabalhadas: ");
			horas = sc.nextInt();
		}
		somaHoras = somaHoras + horas;
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		
		while(valorHora <= 0) {
			System.out.print("Insera um valor positivo para Valor por hora: ");
			valorHora = sc.nextDouble();
		}
		
		
		salario = valorHora * horas;
		
		somaValor = somaValor + salario;
		
		if(salario > maiorSalario) {
			maiorSalario = salario;
			maisRico = nome;
		}
		
		System.out.print("Digitar outro (S/N)?");
		rep = sc.next().charAt(0);
		} while (rep == 's' || rep == 'S');
		
		int opcao;
		do {
		System.out.println();
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção: ");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println();
			System.out.println("Total de horas = " + somaHoras);
		} else if (opcao == 2) {
			System.out.println();
			System.out.printf("Custo total = R$ %.2f%n", somaValor);
		} else if (opcao == 3) {
			System.out.println();
			System.out.println("Pessoa que ganhou mais: " + maisRico);
		}
		
		} while(opcao != 4);
		
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}

}
