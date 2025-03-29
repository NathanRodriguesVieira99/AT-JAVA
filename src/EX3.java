
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu salario mensal: ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = 0;
        String faixaDeCobranca = "";

        double isento = 22847.76;
        double faixa1 = 33919.80;
        double faixa2 = 45012.60;

        if (salarioAnual <= isento) {
            faixaDeCobranca = "Isento";
            imposto = 0;
        } else if (salarioAnual <= faixa1) {
            faixaDeCobranca = "7,5%";
            imposto = (salarioAnual - isento) * 0.075;
        } else if (salarioAnual <= faixa2) {
            faixaDeCobranca = "15%";
            imposto = (faixa2 - isento) * 0.075 + (salarioAnual - faixa1) * 0.15;
        } else {
            faixaDeCobranca = "27,5%";
            imposto = (faixa2 - isento) * 0.075 + (salarioAnual - faixa1) * 0.15 + (salarioAnual - faixa2) * 0.275;
        }

        double salarioLiquidoAnual = salarioAnual - imposto;

        System.out.println("\n--- Resultado para " + nome + " ---");
        System.out.printf("Salário anual: R$ %.2f%n", salarioAnual);
        System.out.println("Faixa de imposto: " + faixaDeCobranca);
        System.out.printf("Imposto devido: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f%n", salarioLiquidoAnual);
        System.out.printf("Salário líquido mensal: R$ %.2f%n", salarioLiquidoAnual / 12);
    }
}
