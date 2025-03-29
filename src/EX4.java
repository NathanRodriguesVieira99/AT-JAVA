import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor do emprestimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Deseja parcelar em quantas parcelas? (entre 6 e 48)");
        int parcelas = scanner.nextInt();

        while (parcelas < 6 || parcelas > 48) {
            parcelas = scanner.nextInt();
        }

        double jurosMes = 0.03;
        double valorTotal = valorEmprestimo * Math.pow(1 + jurosMes, parcelas);
        double valorParcela = valorTotal / parcelas;

        valorTotal = Math.round(valorTotal * 100) / 100;
        valorParcela = Math.round(valorParcela * 100.0) / 100.0;

        System.out.println("Olá " + nome);
        System.out.println("Valor do seu emprestimo é: " + valorEmprestimo + " com parcelas de " + parcelas + "x");
        System.out.println("Com 3% de juros mensal " + " o valor total será: " + valorTotal + " em parcelas de: "
                + valorParcela + " ao mes");
    }
}
