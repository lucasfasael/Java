public class Pix implements Carteira {

    public Pix(double saldo) {
        this.saldo = saldo;
    }
    private double saldo = 0;

    @Override
    public double getSaldo() {
        return saldo;
    }


    @Override

    public void transferir(double input) {
        saldo -= input;
    }
}
