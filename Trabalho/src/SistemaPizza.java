import java.util.Scanner;

// Interfaces que definem os elementos básicos de uma pizza

// Interface para definir a estrutura de uma pizza.
interface Pizza {
    String fazer(); // Método para criar uma pizza.
}

// Interfaces para definir as características de uma pizza
interface TamanhoPizza {
    String fazer(); // Método para definir o tamanho da pizza.
}

interface SaborPizza {
    String fazer(); // Método para escolher o sabor da pizza.
}

interface PagamentoPizza {
    String fazer(); // Método para determinar o método de pagamento da pizza.
}

// Classes que implementam os diferentes tamanhos de pizza
class TamanhoPequeno implements TamanhoPizza {
    public String fazer() {
        return "Tamanho: Pequena, ";
    }
}

class TamanhoMedio implements TamanhoPizza {
    public String fazer() {
        return "Tamanho: Média, ";
    }
}

class TamanhoGrande implements TamanhoPizza {
    public String fazer() {
        return "Tamanho: Grande, ";
    }
}

// Classes que implementam os diferentes sabores de pizza
class SaborMargherita implements SaborPizza {
    public String fazer() {
        return "Sabor: Margherita, ";
    }
}

class SaborPepperoni implements SaborPizza {
    public String fazer() {
        return "Sabor: Pepperoni, ";
    }
}

class SaborCalabresa implements SaborPizza {
    public String fazer() {
        return "Sabor: Calabresa, ";
    }
}

class SaborFrangoCatupiry implements SaborPizza {
    public String fazer() {
        return "Sabor: Frango Catupiry, ";
    }
}

class SaborQuatroQueijos implements SaborPizza {
    public String fazer() {
        return "Sabor: Quatro Queijos, ";
    }
}

// Classes que implementam os diferentes métodos de pagamento para a pizza
class PagamentoCartaoCredito implements PagamentoPizza {
    public String fazer() {
        return "Pagamento: Cartão de Crédito, ";
    }
}

class PagamentoCartaoDebito implements PagamentoPizza {
    public String fazer() {
        return "Pagamento: Cartão de Débito, ";
    }
}

class PagamentoDinheiro implements PagamentoPizza {
    public String fazer() {
        return "Pagamento: Dinheiro, ";
    }
}

class PagamentoPix implements PagamentoPizza {
    public String fazer() {
        return "Pagamento: Pix, ";
    }
}

// Classe que representa um pedido de pizza
class PedidoPizza implements Pizza {
    private final TamanhoPizza tamanho;
    private final SaborPizza sabor;
    private final PagamentoPizza pagamento;

    // Construtor da classe PedidoPizza
    public PedidoPizza(TamanhoPizza tamanho, SaborPizza sabor, PagamentoPizza pagamento) {
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.pagamento = pagamento;
    }

    // Método para criar o pedido de pizza
    public String fazer() {
        return tamanho.fazer() + sabor.fazer() + pagamento.fazer();
    }
}

// Interfaces e classes relacionadas ao padrão Adapter para processamento de pagamento

// Interface para adaptar diferentes métodos de pagamento
interface AdaptadorPagamento {
    String processarPagamento(); // Método para processar o pagamento.
}

class ProcessadorPagamentoCartaoCredito {
    // Classe para processar pagamentos com cartão de crédito
    public String processarPagamento() {
        return "Pagamento com Cartão de Crédito Aceito";
    }
}

class ProcessadorPagamentoCartaoDebito {
    // Classe para processar pagamentos com cartão de débito
    public String processarPagamento() {
        return "Pagamento com Cartão de Débito Aceito";
    }
}

class ProcessadorPagamentoDinheiro {
    // Classe para processar pagamentos em dinheiro
    public String processarPagamento() {
        return "Pagamento em Dinheiro Aceito";
    }
}

class ProcessadorPagamentoPix {
    // Classe para processar pagamentos com Pix
    public String processarPagamento() {
        return "Pagamento com Pix Aceito";
    }
}

// Adaptadores para os diferentes métodos de pagamento
class AdaptadorPagamentoCartaoCredito implements AdaptadorPagamento {
    private final ProcessadorPagamentoCartaoCredito processadorPagamento;

    // Construtor do adaptador de pagamento com cartão de crédito
    public AdaptadorPagamentoCartaoCredito(ProcessadorPagamentoCartaoCredito processadorPagamento) {
        this.processadorPagamento = processadorPagamento;
    }

    // Método para processar o pagamento usando o adaptador
    public String processarPagamento() {
        return processadorPagamento.processarPagamento();
    }
}

class AdaptadorPagamentoCartaoDebito implements AdaptadorPagamento {
    private final ProcessadorPagamentoCartaoDebito processadorPagamento;

    // Construtor do adaptador de pagamento com cartão de débito
    public AdaptadorPagamentoCartaoDebito(ProcessadorPagamentoCartaoDebito processadorPagamento) {
        this.processadorPagamento = processadorPagamento;
    }

    // Método para processar o pagamento usando o adaptador
    public String processarPagamento() {
        return processadorPagamento.processarPagamento();
    }
}

class AdaptadorPagamentoDinheiro implements AdaptadorPagamento {
    private final ProcessadorPagamentoDinheiro processadorPagamento;

    // Construtor do adaptador de pagamento em dinheiro
    public AdaptadorPagamentoDinheiro(ProcessadorPagamentoDinheiro processadorPagamento) {
        this.processadorPagamento = processadorPagamento;
    }

    // Método para processar o pagamento usando o adaptador
    public String processarPagamento() {
        return processadorPagamento.processarPagamento();
    }
}

class AdaptadorPagamentoPix implements AdaptadorPagamento {
    private final ProcessadorPagamentoPix processadorPagamento;

    // Construtor do adaptador de pagamento com Pix
    public AdaptadorPagamentoPix(ProcessadorPagamentoPix processadorPagamento) {
        this.processadorPagamento = processadorPagamento;
    }

    // Método para processar o pagamento usando o adaptador
    public String processarPagamento() {
        return processadorPagamento.processarPagamento();
    }
}

// Interfaces e classes relacionadas ao padrão Decorator para entrada de teclado

// Interface para ler a entrada do teclado
interface EntradaTeclado {
    String lerEntrada(); // Método para ler a entrada do teclado.
}

class EntradaTecladoBasica implements EntradaTeclado {
    // Classe para ler a entrada do teclado de forma básica
    public String lerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os detalhes do seu pedido: ");
        String entrada = scanner.nextLine();
        return entrada;
    }
}

class DecoradorPedidoPizza implements EntradaTeclado {
    private final PedidoPizza pedidoPizza;
    private final EntradaTeclado entradaTeclado;

    // Construtor do decorador para pedido de pizza
    public DecoradorPedidoPizza(PedidoPizza pedidoPizza, EntradaTeclado entradaTeclado) {
        this.pedidoPizza = pedidoPizza;
        this.entradaTeclado = entradaTeclado;
    }

    // Método para ler a entrada do teclado com o decorador
    public String lerEntrada() {
        String pedido = entradaTeclado.lerEntrada();
        return pedidoPizza.fazer() + " - Pedido: " + pedido;
    }
}

// Exemplo funcional do padrão Bridge

// Interface para definir a forma de transporte
interface Transporte {
    void transportar();
}

// Implementação concreta da forma de transporte - Carro
class Carro implements Transporte {
    public void transportar() {
        System.out.println("Transportando por Carro");
    }
}

// Implementação concreta da forma de transporte - Barco
class Barco implements Transporte {
    public void transportar() {
        System.out.println("Transportando por Barco");
    }
}

// Abstração que usa o padrão Bridge para transportar
abstract class Encomenda {
    protected Transporte transporte;

    public Encomenda(Transporte transporte) {
        this.transporte = transporte;
    }

    public abstract void entregar();
}

// Implementação concreta da encomenda - Pacote
class Pacote extends Encomenda {
    public Pacote(Transporte transporte) {
        super(transporte);
    }

    public void entregar() {
        System.out.println("Pacote sendo entregue...");
        transporte.transportar(); // Usa a implementação concreta do transporte
    }
}

public class SistemaPizza {
    public static void main(String[] args) {
        //PADRÃO BRIDGE
        Transporte carro = new Carro();
        Encomenda pacoteViaCarro = new Pacote(carro);
        pacoteViaCarro.entregar(); // Chama o método entregar, que usa a implementação do transporte via carro

        Transporte barco = new Barco();
        Encomenda pacoteViaBarco = new Pacote(barco);
        pacoteViaBarco.entregar(); // Chama o método entregar, que usa a implementação do transporte via barco
    }
}
