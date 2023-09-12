package main;
import components.Card;
import components.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);

        Card card = new Card();
        System.out.println("Digite o limite do cartão: ");
        double limit = scanner.nextDouble();
        card.setLimit(limit);

            while(condition){


                System.out.println("Digite 0 para sair e 1 para continuar: ");
                int option = scanner.nextInt();
                if(option == 0){
                    condition = false;
                    if(cart.size() == 0){
                        System.out.println("Até a próxima !");
                    } else{
                        cart.sort(Comparator.comparing(Product::getPrice));
                        System.out.println(cart);
                    }
                } else if(option == 1){
                    Product product = new Product();
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Qual o nome do produto ? : ");
                    String name = scanner2.nextLine();
                    product.setName(name);
                    System.out.println("Quanto custa este produto ? : ");
                    double price = scanner2.nextDouble();
                    product.setPrice(price);
                    if(price + card.getInvoice() > card.getLimit()){
                        System.out.println("Limite insuficiente para adicionar esta compra !!!");
                    } else{
                        cart.add(product);
                        card.addInvoice(product.getPrice());
                        System.out.println("Produto " + product.getName() + " com o valor de : " + product.getPrice() + " adicionado com sucesso !");
                        System.out.println("Sua fatura atualmente é de : " + card.getInvoice());
                    }

                } else{
                    System.out.println("Opção inválida !");
                }
            }
        }
    }
