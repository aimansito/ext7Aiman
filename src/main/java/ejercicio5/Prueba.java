/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) throws IOException {

        ArrayList<Precipitacion> lista = Lectura.leerFicheroJSON("precipitacionesBadajoz.json");
        Map<String, Double> mapeo = new TreeMap<>();

        for (Precipitacion precipitacion : lista) {
            mapeo.put(precipitacion.getEstacionMeteorologica(), precipitacion.getPrecipitacion());
        }

        System.out.println("\n\nLISTA MAPEADA-----");
        mapeo.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        });

        System.out.println("\n\nEstaciones que han sido leidas entre el 10 y el 20 de octubre de 2017");
        lista.stream()
                .filter(p -> p.getFecha().isAfter(LocalDate.of(2017, Month.OCTOBER, 9)) && p.getFecha().isBefore(LocalDate.of(2017, Month.OCTOBER, 21)))
                .map(p -> p.getEstacionMeteorologica())
                .forEach(System.out::println);

    }

}
