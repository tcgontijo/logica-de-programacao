import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdCompras, inadimplencia, scoreCompras, scoreInadimplencia = 0, scoreFormaPagto = 0;
		double ticket;
		char formaPagto;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");

		System.out.println("");
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		qtdCompras = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticket = sc.nextDouble();
		
		System.out.println("");
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		inadimplencia = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
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
		System.out.println();

		
		if(inadimplencia > 1 || qtdCompras == 0) {
			scoreInadimplencia = 0;
		} else if(qtdCompras > 0 && inadimplencia >= 1) {
			scoreInadimplencia = 15;
		} else if(qtdCompras > 0 && inadimplencia == 0){
			scoreInadimplencia = 30;
		}
		
				
		if(qtdCompras > 0 && (formaPagto == 'd' || formaPagto == 'D') ) {
			scoreFormaPagto = 5;
		} else if(qtdCompras > 0 && (formaPagto == 'c' || formaPagto == 'C') || (formaPagto == 'b' || formaPagto == 'B')) {
			scoreFormaPagto = 10;
		}
		
		System.out.printf("%n");
		System.out.println("Score de inadimpl�ncia = " + scoreInadimplencia + " pontos");
		System.out.println("Score de forma de pagamento = " + scoreFormaPagto + " pontos");
		
						
		sc.close();
	}

}
