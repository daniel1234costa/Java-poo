package Questão04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SimulaConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaComum = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Random random = new Random();

        int tempo = 0;
        int pacientesCriados = 0;
        int pacientesAtendidos = 0;

        while (pacientesAtendidos < 20) {
            if (tempo % 4 == 0 && pacientesCriados < 20) {
                int rg = random.nextInt(999999) + 1;
                int idade = 10 + random.nextInt(80);
                Paciente pacienteNovo = new Paciente(rg, idade);

                if (idade > 60) {
                    filaPrioritaria.add(pacienteNovo);

                } else {
                    filaComum.add(pacienteNovo);

                }
                System.out.println("Paciente chegou: " + pacienteNovo);
                pacientesCriados++;
            }

            if (tempo % 5 == 0 && tempo > 0) {
                Paciente atendido = null;

                if (!filaPrioritaria.isEmpty()) {
                    atendido = filaPrioritaria.poll();

                } else if (!filaComum.isEmpty()) {
                    atendido = filaComum.poll();
                }
                if (atendido != null) {
                    System.out.println("Paciente atendido: " + atendido + " no minuto " + tempo);
                    pacientesAtendidos++;
                }

            }

            tempo++;
        }

        System.out.println("\nDia encerrado!");
           System.out.println(filaPrioritaria);
        System.out.println(filaComum);
    }
}