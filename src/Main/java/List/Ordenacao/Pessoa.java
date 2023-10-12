package Main.java.List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private final String nome;
    private final int idade;
    private final double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | Altura: " + this.altura;
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
}