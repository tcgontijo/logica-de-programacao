import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdCompras, inadimplencia, scoreCompras;
		double ticket;
		char formaPagto;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");

		System.out.println("");
		System.out.print("Quantas compras o cliente fez no último ano? ");
		qtdCompras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		
		System.out.println("");
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		inadimplencia = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		formaPagto = sc.next().charAt(0);
		
		if(qtdCompras == 0) {
			scoreCompras = 0;
		} else if(qtdCompras > 2 && ticket <= 3000.00) {
			scoreCompras = 40;
		} else if(ticket <= 3000.00) {
			scoreCompras = 20;
		} else {
			scoreCompras = 60;
		}
		
		System.out.println();
		System.out.print("Score de volume de compras = " + scoreCompras + " pontos");
						
		sc.close();
	}

}
