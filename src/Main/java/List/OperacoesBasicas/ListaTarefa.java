package Main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefasRemover = new ArrayList<>();

         for (Tarefa tarefa : tarefalist) {
              if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
              }
         }

         tarefalist.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa tarefa : tarefalist) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Spring");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Estudar Java");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    }
}
