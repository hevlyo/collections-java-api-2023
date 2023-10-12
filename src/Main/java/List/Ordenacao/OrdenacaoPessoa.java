package Main.java.List.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        pessoasPorIdade.sort(Pessoa::compareTo);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Maria", 18, 1.60);
        ordenacaoPessoa.adicionarPessoa("José", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Ana", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Pedro", 40, 1.90);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());

    }
}
