package negocio;

import Interfaces.PagamentoAdapter;

public class CartaoCredito implements PagamentoAdapter {

    //CLASSE CARTÃO DE CRÉDITO SOBRESCREVENDO O ADAPTER DE PAGAMENTO
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito: ");
    }
}
