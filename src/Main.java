import Interfaces.Leitor;
import Interfaces.PagamentoAdapter;
import Interfaces.Pizza;
import negocio.*;

public class Main {

    public static void main(String[] args) {
        Leitor leitor = new LeitorTeclado();

        System.out.println("Bem-vindo ao sistema de pedido de pizza!");

        System.out.println("Escolha o tipo de pizza (1 para Calabresa, 2 para Frango):");
        Integer pizzaEscolhida = leitor.lerEntrada(Integer.class);

        Pizza pizza = null;

        if (pizzaEscolhida > 2 || pizzaEscolhida < 1) {
            System.out.println("Sabor Inválido!");
        }

        pizza = pizzaEscolhida == 1 ? new CalabresaPizza() :  new FrangoPizza();

        System.out.println("Digite o valor a ser pago:");
        Double valorPago = leitor.lerEntrada(Double.class);

        System.out.println("Escolha a forma de pagamento (1 para cartão de crédito, 2 para dinheiro):");
        Integer formaPagamentoEscolhida = leitor.lerEntrada(Integer.class);

        PagamentoAdapter pagamentoAdapter = null;

        if (formaPagamentoEscolhida > 2 || formaPagamentoEscolhida < 1) {
            System.out.println("Forma Pagamento Inválida!");
        }
        pagamentoAdapter = formaPagamentoEscolhida == 1 ? new CartaoCredito() : new Dinheiro();

        System.out.println("Pedido confirmado:");
        pizza.preparar();
        pagamentoAdapter.realizarPagamento(valorPago);

        System.out.println("Obrigado por usar nosso sistema de pedido de pizza!");
    }

}