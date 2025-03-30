
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) throws Exception {
        // escrever o txt
        String caminhoArquivo = "C:\\Projetos VsCode\\AT JAVA\\AT-JAVA\\compras.txt";

        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe o produto");
            String produto = scanner.nextLine();

            System.out.println("Informe o preço");
            double preco = scanner.nextDouble();

            System.out.println("Informe a quantidade");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            // Ao usar o String.format()
            // %s transforma o valor em uma String -> produto = "Coca Cola" -> Produto: Coca Cola
            // %.2f transforma em um numero com 2 casas decimais depois do . preco = 9.9 -> Preço: 9.90
            // %d transforma em numero int quantidade = 3 -> Quantidade: 3
            escritor.write(String.format("Produto: %s, \n Preço: %.2f, \n Quantidade: %d \n", produto, preco, quantidade));
            escritor.write("----------------------------------------\n");
        }

        escritor.close();

        // ler o txt
        try (BufferedReader leitorDeArquivos = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitorDeArquivos.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitorDeArquivos.readLine();
            }
        } catch (Exception erro) {
            System.out.println("Erro ao ler arquivo");
            System.out.println(erro.getMessage());
        }

    }
}
