package negocio;

import Interfaces.PagamentoAdapter;

public class CartaoCredito implements PagamentoAdapter {

    //CLASSE CART�O DE CR�DITO SOBRESCREVENDO O ADAPTER DE PAGAMENTO
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cart�o de cr�dito: ");
    }
}
