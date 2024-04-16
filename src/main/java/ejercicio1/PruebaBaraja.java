/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author cristina
 */
public class PruebaBaraja {

    //Método el cual hace que el palo se genere aleatoriamente
    public static String palo(int palo) {
        String resultado = "";
        switch (palo) {
            case 1:
                resultado = "picas";
                break;
            case 2:
                resultado = "rombos";
                break;
            case 3:
                resultado = "corazones";
                break;
            case 4:
                resultado = "tréboles";
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Baraja> baraja = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= 14; j++) {
                Baraja carta = new Baraja(palo(i), j);
                baraja.add(carta);
            }
        }
        for (Baraja baraja1 : baraja) {
            System.out.println(baraja1.toString());
        }
    }

}
