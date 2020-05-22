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
		nome = sc.next();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		
		while (salario < 0) {
			System.out.println("\nO SALARIO DEVE SER MAIOR QUE ZERO!\n");
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		}
		
		double nPrestacoes, pEntrada, valorFinan, prestacao;
		
		System.out.print("Numero de prestacoes: ");
		nPrestacoes = sc.nextDouble();
		System.out.print("Porcentagem de entrada: ");
		pEntrada = sc.nextDouble();
		
		
		do {
			System.out.print("Valor total financiado: ");
			valorFinan = sc.nextDouble();
			prestacao = (valorFinan - (valorFinan * (pEntrada / 100.00))) / nPrestacoes;
			if(prestacao > (salario * 0.30)) {
				System.out.println("\nA PRESTACAO NAO PODE SER MAIOR DO QUE 30% DO SALARIO!\n");
			}	
			} while (prestacao > (salario * 0.30));		
		sc.close();
	}

}
