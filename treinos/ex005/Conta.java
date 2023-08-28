class Poupanca extends Conta{
    public Poupanca (String numero, double saldo){
        super(numero, saldo);
    }
    public void renderJuros(double taxa){
        this.saldo += (this.saldo * taxa);
    }
}
public class Conta{
    private String numero;
    protected double saldo;
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void setNome(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return this.numero;
    }
    public double getSaldo(){
         return this.saldo;
    }
    public void creditar(double valor){
        this.saldo += valor;
    }
    public void debitar(double valor){
        this.saldo -= valor;
    }
}