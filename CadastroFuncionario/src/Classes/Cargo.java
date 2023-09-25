package Classes;

import Interface.Pagamento;

public class Cargo implements Pagamento{
    String nomeCargo;

    double salario;

    public String getNomeCargo() {
        return nomeCargo;
    }

    public double getSalario() {
        return salario;
    }

    public Cargo() {
    }


    @Override
    public double pagarSalario(double salario, double saldo) {
        return salario + saldo;
    }
}
