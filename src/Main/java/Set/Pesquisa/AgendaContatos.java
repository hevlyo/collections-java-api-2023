package Main.java.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        if (contatoSet.contains(contato)) {
            System.out.println("Contato já existe");
        } else {
            contatoSet.add(contato);
            System.out.println("Contato adicionado");
        }
    }

    public void exibirContatos() {
        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String name) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(name)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(String.valueOf(novoNumero));
                return contato;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", "123456789");
        agendaContatos.adicionarContato("Maria", "987654321");
        agendaContatos.adicionarContato("José", "123456789");
        agendaContatos.adicionarContato("João", "123456789");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Jo"));
        agendaContatos.atualizarNumeroContato("João", 123);
        System.out.println("Contatos atualizados");
        agendaContatos.exibirContatos();
    }
}
