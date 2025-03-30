import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro user: ");
        String nome1 = scanner.nextLine();

        System.out.print("Informe o segundo user: ");
        String nome2 = scanner.nextLine();

        String[] historico = new String[10];

        for (int i = 0; i < 10; i++) {
            String atualUser = (i % 2 == 0) ? nome1 : nome2;
            
            System.out.print(atualUser + ", digite a sua mensagem: ");
            String mensagem = scanner.nextLine();
            
            historico[i] = atualUser + ": " + mensagem;
        }

        System.out.println("\n-------- Histórico da Conversa --------");
        for (String msg : historico) {
            System.out.println(msg);
        }
        
        System.out.println("\n A conversa foi encerrada");
        scanner.close();
    }
}