package map.Ordenacao;

import java.util.*;
import java.time.LocalDate;
import java.time.Month;

public class AgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();


        agendaEventos.adicionarEventos(LocalDate.of(2024, 10, 10), "NOME1", "ATRACAO1");
        agendaEventos.adicionarEventos(LocalDate.of(2025, Month.APRIL, 20), "NOME2", "ATRACAO2");

        agendaEventos.exibirAgenda();

    }

    // atributo 
    private Map<LocalDate, Evento> eventosMap;


    // construtor
    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    // metodos
        // adicionar evento 
        public void adicionarEventos(LocalDate data, String nome, String atracao){
            // Evento evento = new Evento(nome, atracao);
            eventosMap.put(data, new Evento (nome, atracao));
        }


        // exibir agenda 
        public void exibirAgenda(){
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            System.out.println(eventosTreeMap);
        }

        public void obterProximoEvento(){
            // Set<LocalDate> dateSet = eventosMap.keySet();
            // Collection<Evento> values = eventosMap.values();
            // eventosMap.get();

            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Evento proximoEvento = null;
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O proximo evento: " + proximaData + " acontecerá na data " + proximoEvento);
                    break;
                }
            }
        }



}
