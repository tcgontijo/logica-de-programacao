import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
				
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome = sc.nextLine();
		do {
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		} while (salario < 0);
		
		int nPrestacoes;
		double pEntrada, valorFinan, prestacao;
		
		System.out.print("Numero de prestacoes: ");
		nPrestacoes = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		pEntrada = sc.nextDouble();
		
		
		do {
			System.out.print("Valor total financiado: ");
			valorFinan = sc.nextDouble();
			prestacao = (valorFinan - (valorFinan * (pEntrada / 100.00))) / nPrestacoes;
			} while (prestacao > (salario * 0.30));		
		
		int opcao;
		do {
			System.out.println("\nMENU:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.printf("\nENTRADA = R$ %.2f%n" , (valorFinan * (pEntrada / 100.00)));
		} else if (opcao == 2) {
			System.out.printf("\nVALOR FINANCIADO = R$ %.2f%n" , valorFinan - (valorFinan * (pEntrada / 100.00)));
		} else if (opcao == 3) {
			System.out.printf("\nVALOR DE CADA PRESTACAO = R$ %.2f%n", prestacao);
		} else if (opcao == 4) {
			System.out.println("\nFIM DO PROGRAMA!");
		} else {
			System.out.println("\nDIGITE UMA OPCAO VALIDA!");
		}
		} while(opcao != 4);
		
		sc.close();
	}

}
