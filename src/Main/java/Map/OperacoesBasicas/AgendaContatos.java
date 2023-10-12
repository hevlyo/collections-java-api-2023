package Main.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatoMap.containsKey(nome)) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void exibirContatos() {
        for(Map.Entry<String, Integer> entry : agendaContatoMap.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " - Telefone: " + entry.getValue());
        }
    }

    public Integer pesquisarPorNome(String nome) {
        if(agendaContatoMap.containsKey(nome)) {
            return agendaContatoMap.get(nome);
        } else {
            System.out.println("Contato não encontrado!");
            return null;
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 456789123);

        agendaContatos.exibirContatos();

        System.out.println("Removendo contato...");
        agendaContatos.removerContato("Maria");

        agendaContatos.exibirContatos();
        System.out.println("Pesquisando contato...");
        System.out.println("O numéro é: " + agendaContatos.pesquisarPorNome("João"));
    }
}
