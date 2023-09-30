package Main.java.List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        for (Item item : this.itens) {
            if (item.getNome().equals(nome)) {
                this.itens.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : this.itens) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        System.out.println("Removendo um item do carrinho...");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
