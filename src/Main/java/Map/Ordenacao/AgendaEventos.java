package Main.java.Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (LocalDate data : eventosTreeMap.keySet()) {
            System.out.println(data + " - " + eventosTreeMap.get(data));
        }
    }

    public void exibirProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento.getNome() + " - " + proximoEvento.getAtracao() + " será no dia " + proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2021, 10, 10), "Show do Metallica", "Metallica");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 11), "Show do Iron Maiden", "Iron Maiden");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 12), "Show do Sepultura", "Sepultura");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 13), "Show do Slayer", "Slayer");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 14), "Show do Megadeth", "Megadeth");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 15), "Show do Black Sabbath", "Black Sabbath");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 16), "Show do Judas Priest", "Judas Priest");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 17), "Show do Pantera", "Pantera");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 18), "Show do Motorhead", "Motorhead");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 19), "Show do Angra", "Angra");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 20), "Show do Dream Theater", "Dream Theater");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 21), "Show do Helloween", "Helloween");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 22), "Show do Avantasia", "Avantasia");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 23), "Show do Symphony X", "Symphony X");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 24), "Show do Nightwish", "Nightwish");
        agenda.adicionarEvento(LocalDate.of(2023, 10, 25), "Show do Epica", "Epica");
        agenda.adicionarEvento(LocalDate.of(2023, 10, 26), "Show do Lacuna Coil", "Lacuna Coil");

        agenda.exibirAgenda();

        System.out.println("\nPróximo evento:");
        agenda.exibirProximoEvento();

    }
}
