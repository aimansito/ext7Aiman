/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author aiman
 */
public class Estadistica {
    private ArrayList<Integer> notas;

    private Estadistica(String iniciales, ArrayList<RegistroJSON> json) {
        this.notas = new ArrayList<>();
    }

//    private List<String> obtenerCalificacionesPorModulo(List<RegistroJSON> registros, String inicialesModulo) {
//        return (List<String>) registros.stream()
//                .filter(registro -> registro.().startsWith(inicialesModulo))
//                .map(registro -> registro.getCalificacion())
//                .collect((Collector<? super Object, A, R>) Collectors.toList());
//    }
//    public Estadistica(List<RegistroJSON> registros, String inicialesModulo) {
//        this.notas = registros.stream()
//                .filter(registro -> registro.getModulo().startsWith(inicialesModulo))
//                .map(RegistroJSON::getCalificacion)
//                .filter(calificacion -> calificacion >= 0)
//                .collect(Collectors.toList());
//    }
    private int obtenerRepresentacionNumerica(String texto) {
    try {
        return Integer.parseInt(texto);
    } catch (NumberFormatException e) {
        return -1;
    }
}
    public Estadistica() {
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estadistica{");
        sb.append("notas=").append(notas);
        sb.append('}');
        return sb.toString();
    }

    
}
