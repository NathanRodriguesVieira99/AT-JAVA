import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();

        if (senha.length() < 8) {
            System.out.println("Senha inválida pois tem menos de 8 caracteres, tente novamente!");
        } else if (!senha.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$")) {
            System.out.println("Senha inválida pois precisa de uma letra maiuscula, numero e caractere especial");
        } else {
            System.out.println("Parabéns, nome e senha cadastrados");
        }
    }
}