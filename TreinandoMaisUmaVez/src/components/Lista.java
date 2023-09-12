package components;

public class Lista<T> {
    private No<T> inicio;
    private No<T> fim;

    public void add(T e){
        if(this.inicio != null){
            No<T> noInicio = new No<>(e);
            this.inicio = noInicio;
            this.fim = this.inicio;
            return;
        }
        No<T> novoNo = new No<>(e);
        novoNo.setAnterior(this.fim);
        this.fim.setProximo(novoNo);
        this.fim = novoNo;

    }

}
