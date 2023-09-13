package negocio;

import Interfaces.Pizza;

public class CalabresaPizza implements Pizza {

    // CLASSE CONCRETA QUE IMPLEMENTA INTERFACE PIZZA, SOBRESCREVENDO OS MÉTODOS DA INTERFACE
    @Override
    public void assar() {
        System.out.println("Assando pizza de calabresa");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de calabresa");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de calabresa");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando pizza de calabresa");
    }
}
