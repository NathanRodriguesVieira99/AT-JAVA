public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$: " + valor + " realizado");
        } else {
            System.out.println("Deposito nao realizado!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$: " + valor + " realizado");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Saque não realizado");
        }
    }

    public void exibirSaldo() {
        System.out.println("O saldo de sua conta é: " + saldo);
        System.out.println("------------------------");
    }
}
