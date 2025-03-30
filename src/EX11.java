import java.util.Random;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] sorteio = new int[6];
        int[] palpites = new int[6];
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            int num;
            boolean repetido;
            do {
                repetido = false;
                num = random.nextInt(60) + 1;
                for (int j = 0; j < i; j++) {
                    if (sorteio[j] == num) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            sorteio[i] = num;
        }

        System.out.println("Digite os 6 numeros: ");
        for (int i = 0; i < 6; i++) {
            palpites[i] = scanner.nextInt();
        }

     
        for (int numeroEscolhido : palpites) {
            for (int numeroSorteado : sorteio) {
                if (numeroEscolhido == numeroSorteado) {
                    acertos++;
                    break;
                }
            }
        }

      
        System.out.print("Numeros Sorteados: ");
        for (int num : sorteio) {
            System.out.print(num + " ");
        }
        System.out.println("\nAcertou: " + acertos + " numeros");
        scanner.close();
    }
}