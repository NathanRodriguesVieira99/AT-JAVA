public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilomentragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilomentragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilomentragem = quilomentragem;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do veiculo: ");
        System.out.println("-----------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("KM rodados: " + quilomentragem);
    }

    public void registrarViagem(double km) {
        this.quilomentragem += km;
    }
}
