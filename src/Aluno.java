public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        double mediaCalculada = (nota1 + nota2 + nota3) / 3;
        return mediaCalculada;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado!";
        } else {
            return "Reprovado";
        }
    }

    public void exibirInfosAluno() {
        System.out.println("O aluno: " + nome + " está " + verificarAprovacao());
    }
}
