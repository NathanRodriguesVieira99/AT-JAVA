
public class Main {

    public static void main(String[] args) {
        // Veiculo bmw = new Veiculo("LTL-666-999", "X6", 2023, 0);
        // bmw.exibirDetalhes();

        // Veiculo lancer = new Veiculo("000-999-TDD", "Evo X", 2012, 20000);
        // lancer.registrarViagem(250);
        // lancer.exibirDetalhes();

        Aluno aluno1 = new Aluno("Zé do Caixão", 1996, 7, 0, 0);
        aluno1.calcularMedia();
        aluno1.verificarAprovacao();
        aluno1.exibirInfosAluno();

        Aluno aluno2 = new Aluno("Max Cavalera", 1969, 7, 7, 7);
        aluno2.calcularMedia();
        aluno2.verificarAprovacao();
        aluno2.exibirInfosAluno();
    }

}
