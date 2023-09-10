package aluno;

import java.util.ArrayList;

public class Aluno {


    private String nome;
    private Aluno anterior;
    private Aluno proximo;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAnterior() {
        return anterior;
    }

    public void setAnterior(Aluno anterior) {
        this.anterior = anterior;
    }

    public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }


    @Override
    public String toString() {
        return "\nNome: " + getNome() + " anterior: " + getAnterior() + " posterior: " + getProximo();
    }
}
