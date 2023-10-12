package Main.java.Set.Ordenacao;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, codigo, preco, quantidade);
        produtoSet.add(produto);
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Arroz", 10.0, 10);
        cadastroProdutos.adicionarProduto(2, "Feijão", 5.0, 10);
        cadastroProdutos.adicionarProduto(3, "Macarrão", 3.0, 10);
        cadastroProdutos.adicionarProduto(4, "Carne", 20.0, 10);
        cadastroProdutos.adicionarProduto(5, "Frango", 15.0, 10);
        cadastroProdutos.adicionarProduto(6, "Peixe", 25.0, 10);
        cadastroProdutos.adicionarProduto(7, "Ovo", 2.0, 10);
        cadastroProdutos.adicionarProduto(8, "Leite", 4.0, 10);
        cadastroProdutos.adicionarProduto(9, "Café", 6.0, 10);
        cadastroProdutos.adicionarProduto(10, "Açúcar", 2.0, 10);

        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Produtos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
