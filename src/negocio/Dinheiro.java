package negocio;

import Interfaces.PagamentoAdapter;

public class Dinheiro implements PagamentoAdapter {

    //CLASSE DINHEIRO SOBRESCREVENDO O ADAPTER DE PAGAMENTO
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
}
