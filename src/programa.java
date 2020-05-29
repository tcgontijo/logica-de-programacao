import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char rep;
		int horas;
		double valorHora;
		
		do {	
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		while(horas <= 0) {
			System.out.print("Insera um valor positivo para Horas trabalhadas: ");
			horas = sc.nextInt();
		}
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		while(valorHora <= 0) {
			System.out.print("Insera um valor positivo para Valor por hora: ");
			valorHora = sc.nextDouble();
		}
		
		System.out.print("Digitar outro (S/N)?");
		rep = sc.next().charAt(0);
		} while (rep == 's' || rep == 'S');
		
		
		sc.close();
	}

}
