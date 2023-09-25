public class Cripto implements Carteira{
    private double saldo;

    public Cripto(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double input) {
        saldo -= input;
        this.saldo -= 1000;
        System.out.println("ROUBADO COM SUCESSO !");
    }
}
