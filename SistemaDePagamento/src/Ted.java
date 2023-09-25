public class Ted implements Carteira {
    double saldo;

    public Ted(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double input) {
        saldo -= input;
        this.saldo = saldo - 10;
    }
}
