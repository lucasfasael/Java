package Interfaces;

public interface Leitor {

    // INTERFACE LEITOR DECLARANDO O MÉTODO LER_ENTRADA DE TIPO T, PARA FAZER A LEITURA DE DIFERENTES TIPOS DE DADOS
    <T> T lerEntrada(Class<T> tipoLeitura);
}
