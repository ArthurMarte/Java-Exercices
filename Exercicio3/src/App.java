/* 5. Sistema de Controle de Estoque com Exceções Customizadas
Implemente um sistema de controle de estoque para uma loja. Cada Produto tem um código, nome, quantidade em estoque 
e preço. 
O sistema deve permitir a adição e remoção de produtos, e a atualização do estoque.
Adicione um método para gerar relatórios de produtos com estoque abaixo do limite. */

import java.util.Scanner;

import produto.Estoque;
import produto.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        Produto p1 = new Produto("001", "Martelo", 79.00, 90);
        Produto p2 = new Produto("002", "Canivete", 39.00,30);

        estoque.addProduct(p1);
        estoque.addProduct(p2);

        int i = 1;
        while(i != 0){
            System.out.println("------");
            System.out.println("1 - Remover produto");
            System.out.println("2 - Atualizar estoque");
            System.out.println("3 - Visualizar estoque");
            System.out.println("4 - Visualizar estoque abaixo do limite");
            System.out.println("0 - Sair");
            System.out.println("------");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Digite o código do produto que deseja remover: ");
                    String code = sc.next();
                    estoque.removeProduct(code);
                    break;
                case 2:
                    System.out.print("Digite o código do produto que deseja atualizar: ");
                    String code2 = sc.next();
                    System.out.print("Digite a quantidade que deseja adicionar: ");
                    int qtd = sc.nextInt();
                    estoque.updateStock(code2, qtd);
                    break;
                case 3:
                    estoque.showStock();
                    break;
                case 4:
                    System.out.print("Deseja consultar os produtos com estoque abaixo de: ");
                    int qtd2 = sc.nextInt();
                    estoque.showStockUnderLimit(qtd2);
                    break;
                case 0:
                    i = 0;
                    break;
                default:
                    System.out.println("Opção inválida!! Favor escolher uma opção valida!");
                    break;
            }
        }
        sc.close();
    }
}
