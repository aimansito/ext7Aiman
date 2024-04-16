/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) throws IOException {

        ArrayList<Precipitacion> lista = Lectura.leerFicheroJSON("precipitacionesBadajoz.json");

        System.out.println("Lista completa después de la lectura-------");
        for (Precipitacion precipitacion : lista) {
            System.out.println(precipitacion.toString());
        }


    }

}
