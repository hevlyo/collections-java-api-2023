package Main.java.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidadosSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado) {
        convidadosSet.removeIf(convidado -> convidado.getCodigoConvidado() == codigoConvidado);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        convidadosSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.adicionarConvidado("Pedro", 5);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
}
