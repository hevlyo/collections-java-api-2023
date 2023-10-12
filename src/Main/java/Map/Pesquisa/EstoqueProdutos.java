package Main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void removerProduto(Long codigo) {
        if(estoqueProdutosMap.containsKey(codigo)) {
            estoqueProdutosMap.remove(codigo);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void exibirProdutos() {
        for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " - Produto: " + entry.getValue());
        }
    }

    public double CalcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                valorTotalEstoque += entry.getValue().getPreco() * entry.getValue().getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double precoProdutoMaisCaro = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                if(entry.getValue().getPreco() > precoProdutoMaisCaro) {
                    precoProdutoMaisCaro = entry.getValue().getPreco();
                    produtoMaisCaro = entry.getValue();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double quantidadeValorTotalNoEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                if(entry.getValue().getQuantidade() * entry.getValue().getPreco() > quantidadeValorTotalNoEstoque) {
                    quantidadeValorTotalNoEstoque = entry.getValue().getQuantidade() * entry.getValue().getPreco();
                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Arroz", 10, 10.00);
        estoqueProdutos.adicionarProduto(2L, "Feijão", 10, 5.00);
        estoqueProdutos.adicionarProduto(3L, "Macarrão", 10, 3.00);
        estoqueProdutos.adicionarProduto(4L, "Carne", 10, 20.00);
        estoqueProdutos.adicionarProduto(5L, "Frango", 10, 15.00);

        estoqueProdutos.exibirProdutos();

        System.out.println("Removendo produto...");
        estoqueProdutos.removerProduto(2L);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.CalcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade de valor total no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
