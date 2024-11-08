package produto;
import java.util.HashMap;
import java.util.Map;

import exception.EstoqueInsuficienteException;
import exception.ProdutoNaoEncontradoException;

public class Estoque {
    private Map<String, Produto> produtos;


    //construtor utilizando Hashmap para facilitar a manipulação dos dados
    public Estoque() {
        produtos = new HashMap<>();
    }


    //função para adicionar um produto novo
    //put é um método do hasmap que adicionar um par chave-valor ao mapa.
    public void addProduct(Produto produto){
        produtos.put(produto.getCode(), produto);
    }

    //função para remover um produto
    //remove é um método do hasmap que remove um par chave-valor do mapa.
    public void removeProduct(String code)throws exception.ProdutoNaoEncontradoException{
        try{
            if(!produtos.containsKey(code)){
                throw new exception.ProdutoNaoEncontradoException("Produto nao econtrado, código: " + code);
            }else{
                produtos.remove(code);
            }
        }catch (ProdutoNaoEncontradoException e) {
            // Aqui você trata a exceção e evita que o sistema pare
            System.out.println(e.getMessage());
        }
    }

    //função para atualizar estoque dos produtos
    public void updateStock(String code, int qtd)throws exception.ProdutoNaoEncontradoException, exception.EstoqueInsuficienteException{
        try{
            if(!produtos.containsKey(code)){
                throw new exception.ProdutoNaoEncontradoException("Produto nao econtrado, código: " + code);
                
            }
            else if(produtos.get(code).getStockQt() + qtd < 0){
                throw new exception.EstoqueInsuficienteException("Estoque insuficiente");
            }
            else{
                produtos.get(code).setStockQt(qtd + produtos.get(code).getStockQt());
            } 
        }
        catch (ProdutoNaoEncontradoException e) {
            // Tratamento da exceção de produto não encontrado
            System.out.println(e.getMessage());
        }
        catch (EstoqueInsuficienteException e) {
            // Tratamento da exceção de estoque insuficiente
            System.out.println(e.getMessage());
        } 
    }

    //funcao para listar todos os itens do estoque
    //produtos é um hashmap criado na classe que armazena os pares chave-valor.
    //quando o loop é executado, ele percorre todos os objetos Produto armazenados no hashmap.
    public void showStock(){
        System.out.println("Lista dos produtos em estoque: ");
        System.out.println("---");
        for(Produto produto : produtos.values()){
            System.out.println("Produto: " + produto.getName());
            System.out.println("Preço: R$" + produto.getPrice());
            System.out.println("Quantidade em estoque: " + produto.getStockQt());
            System.out.println("--");
        }
    }

    //funcao para listar os itens que estão abaixo do estoque esperado.
    public void showStockUnderLimit(int qtd){
        System.out.println("Produtos abaixo do estoque esperado de: " + qtd + " produtos");
        System.out.println("---");
        for(Produto produto : produtos.values()){
            if(produto.getStockQt() < qtd){
                System.out.println("Produto: " + produto.getName());
                System.out.println("Preço: R$" + produto.getPrice());
                System.out.println("Quantidade em estoque: " + produto.getStockQt());
                System.out.println("--");
            }
        }
    }



    
}
