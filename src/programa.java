import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, servicos, capital, medicos, educacao, impSalario, impServicos, impCapital, maxDedutivel,
				gastoDedutivel, impostoBruto, abatimento;

		// Leitura dos dados
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

		// Consolidado da renda

		if ((salario / 12) < 3000.00) {
			impSalario = 0;
		} else if ((salario / 12) >= 3000.00 && (salario / 12) < 5000.00) {
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
		System.out.printf("Imposto sobre salário: %.2f%n", impSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impCapital);

		// Deducoes

		impostoBruto = impCapital + impSalario + impServicos;
		maxDedutivel = impostoBruto * 0.3;
		gastoDedutivel = medicos + educacao;

		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastoDedutivel);

		// Relatorio finalizado

		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		if (gastoDedutivel >= maxDedutivel) {
			abatimento = maxDedutivel;
		} else {
			abatimento = gastoDedutivel;
		}
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", (impostoBruto - abatimento));

		sc.close();
	}

}
