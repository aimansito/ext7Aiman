/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author aiman
 */
public class Programa {
    public static void main(String[] args) throws IOException {
        Map<String, String> mapModulos = LecturaCSV.leerCSV("./nombresModulos.csv");
        System.out.println(mapModulos);
        
        ArrayList<RegistroJSON> listaReg = LecturaJSON.leerJSON("./calificacionesGrupo.json");
        System.out.println(listaReg.toString());
        
        ArrayList<Alumnado> listaAlumnado = RegistrosToAlumnado.regToAlum(listaReg);
        Collections.sort(listaAlumnado);
        
        for (Alumnado alumnado : listaAlumnado) {
            if (alumnado.getNombre().contains("Delia")){
                
                AlumnoToCSV.alumnoTSV(alumnado, mapModulos);
                
            }
        }
    }
}
