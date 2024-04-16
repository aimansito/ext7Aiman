/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class PruebaBaraja {

    public static void main(String[] args) {

        ArrayList<Baraja> baraja = Lectura.lecturaTxt("escaleraColor.txt");

        System.out.println("Estos son los naipes");
        for (Baraja baraja1 : baraja) {
            if (baraja1.getValor() >= 11 && baraja1.getValor() <= 14) {
                System.out.println(baraja1.toString());
            }
        }
    }

}
