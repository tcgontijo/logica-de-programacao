import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, servicos, capital, medicos, educacao, impSalario, impServicos, impCapital, maxDedutivel, gastoDedutivel;
		
		
		//Leitura dos dados
		System.out.print("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		servicos = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		medicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		educacao = sc.nextDouble();
		
		//Consolidado da renda
		
		if((salario / 12) < 3000.00) {
			impSalario = 0;
		} 
		else if((salario / 12) >= 3000.00 && (salario / 12) < 5000.00 ) {
			impSalario = salario * 0.1;
		} else {
			impSalario = salario * 0.2;
		}
		
		impServicos = servicos * 0.15;
		impCapital = capital * 0.20;
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre salário: " + impSalario);
		System.out.println("Imposto sobre serviços: " + impServicos);
		System.out.println("Imposto sobre ganho de capital: " + impCapital);
		
		//Deducoes
		
		maxDedutivel = (impCapital + impSalario + impServicos) * 0.3;
		gastoDedutivel = medicos + educacao;
				
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.println("Máximo dedutível: " + maxDedutivel);
		System.out.println("Gastos dedutíveis: " + gastoDedutivel);
		
		sc.close();
	}

}
