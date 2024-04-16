/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(LecturaCSV.leerCSV("./nombresModulos.csv"));
        ArrayList<RegistroJSON> registro = LecturaJSON.leerJSON("./calificacionesGrupo.json");
        for (RegistroJSON registroJSON : registro) {
            System.out.println(registroJSON);
        }
    }
}
