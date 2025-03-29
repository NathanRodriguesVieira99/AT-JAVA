
public class Main {

    public static void main(String[] args) {
        Veiculo bmw = new Veiculo("LTL-666-999", "X6", 2023, 0);
        bmw.exibirDetalhes();

        Veiculo lancer = new Veiculo("000-999-TDD", "Evo X", 2012, 20000);
        lancer.registrarViagem(250);
        lancer.exibirDetalhes();
    }

}
