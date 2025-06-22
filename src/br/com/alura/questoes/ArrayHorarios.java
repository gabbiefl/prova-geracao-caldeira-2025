package br.com.alura.questoes;

import java.util.ArrayList;

public class ArrayHorarios {
    public static void verificarHorarioArray() {
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("8:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.add("14:00");

        System.out.println(horarios.get(1));
    }
}
