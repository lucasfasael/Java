package Classes;

import Interface.Pagamento;

public class Funcionario {

    public Funcionario(String nome, Cargo cargo, ContaBancaria contaBancaria) {
        this.nome = nome;
        this.cargo = cargo;
        this.contaBancaria = contaBancaria;
    }

    private String nome;
    private Cargo cargo;
    private ContaBancaria contaBancaria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo.getNomeCargo() +
                ", contaBancaria=" + contaBancaria.getSaldo() +
                '}';
    }
}
