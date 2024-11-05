/*1. Sistema de Biblioteca com Polimorfismo
Crie um sistema de biblioteca onde existam diferentes tipos de materiais: Livros, Revistas, e Artigos. 
Cada material deve ter atributos comuns como título, autor e ano de publicação, mas os métodos como getResumo() 
devem retornar informações específicas dependendo do tipo de material.
Use polimorfismo para implementar esse comportamento.
Adicione métodos para empréstimo e devolução, garantindo que um material não possa ser emprestado se já estiver 
emprestado.*/



import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import material.*;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Criando a lista de materiais
        List<Material> materiais = new ArrayList<>();

        materiais.add(new Livro("Joao e o pe de feijao", "Arthur gostoso", 2019, 3790));
        materiais.add(new Revista("Hamptons Magazine", "Hugo gloss", 2024, "12° edicão"));
        materiais.add(new Artigo("Como fazer dinheiro!", "Primo rico", 2023));

        int opcao;
        do {
            // Exibir o menu
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Emprestar material");
            System.out.println("2 - Devolver material");
            System.out.println("0 - Sair");
            opcao = sc.nextInt(); 

            if (opcao == 1 || opcao == 2) {
                // Exibir a lista de materiais disponíveis
                System.out.println("Escolha o material:");
                for (int i = 0; i < materiais.size(); i++) {
                    System.out.println(i + " - " + materiais.get(i).getResumo());
                }

                int escolhaMaterial = sc.nextInt(); 
                if (escolhaMaterial >= 0 && escolhaMaterial < materiais.size()) {
                    Material materialEscolhido = materiais.get(escolhaMaterial);

                    if (opcao == 1) {  // Emprestar o material
                        materialEscolhido.emprestar();
                    } else if (opcao == 2) {  // Devolver o material
                        materialEscolhido.devolver();
                    }
                } else {
                    System.out.println("Material inválido.");
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);  // O loop continua até que o usuário escolha sair

        sc.close();  // Fecha o Scanner
    }
}
