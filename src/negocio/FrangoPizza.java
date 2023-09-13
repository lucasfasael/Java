package negocio;

import Interfaces.Pizza;

public class FrangoPizza implements Pizza {
    // CLASSE CONCRETA QUE IMPLEMENTA INTERFACE PIZZA, SOBRESCREVENDO OS MÉTODOS DA INTERFACE
    @Override
    public void assar() {
        System.out.println("Assando pizza de frango");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de frango");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de frango");
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando pizza de frango");
    }
}
