/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio2.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Lectura {

    //Método el cual lee un txt y devuelve una lista de cartas
    public static ArrayList<Baraja> lecturaTxt(String idFichero) {
        ArrayList<Baraja> baraja = new ArrayList<>();

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "us-ascii")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(" ");
                Baraja carta1 = new Baraja();
                Baraja carta2 = new Baraja();
                Baraja carta3 = new Baraja();
                Baraja carta4 = new Baraja();

                //para los valores que son letras se acepten como números
                if (tokens[0].equals("A") || tokens[0].equals("J") || tokens[0].equals("Q") || tokens[0].equals("K")
                        || tokens[2].equals("A") || tokens[2].equals("J") || tokens[2].equals("Q") || tokens[2].equals("K")
                        || tokens[4].equals("A") || tokens[4].equals("J") || tokens[4].equals("Q") || tokens[4].equals("K")
                        || tokens[6].equals("A") || tokens[6].equals("J") || tokens[6].equals("Q") || tokens[6].equals("K")) {

                    //Token 0
                    switch (tokens[0]) {
                        case "A":
                            carta1.setValor(14);

                            break;
                        case "Q":
                            carta1.setValor(12);

                            break;
                        case "J":
                            carta1.setValor(11);

                            break;
                        case "K":
                            carta1.setValor(13);

                            break;
                    }

                    //Token 2
                    switch (tokens[2]) {
                        case "A":

                            carta2.setValor(14);

                            break;
                        case "Q":

                            carta2.setValor(12);

                            break;
                        case "J":
                            carta2.setValor(11);
                            break;
                        case "K":
                            carta2.setValor(13);
                            break;
                    }

                    //Token 4
                    switch (tokens[4]) {
                        case "A":
                            carta3.setValor(14);
                            break;

                        case "Q":
                            carta3.setValor(12);
                            break;
                        case "J":
                            carta3.setValor(11);
                            break;
                        case "K":
                            carta3.setValor(13);
                            break;
                    }

                    //Token 6
                    switch (tokens[6]) {
                        case "A":
                            carta4.setValor(14);
                            break;
                        case "Q":
                            carta4.setValor(12);
                            break;
                        case "J":
                            carta4.setValor(11);
                            break;
                        case "K":
                            carta4.setValor(13);
                            break;
                    }
                } else {
                    carta1.setValor(Integer.parseInt(tokens[0]));
                    carta2.setValor(Integer.parseInt(tokens[2]));
                    carta3.setValor(Integer.parseInt(tokens[4]));
                    carta4.setValor(Integer.parseInt(tokens[6]));
                }
                //Para que las letras sean palos
                //Token 1
                switch (tokens[1]) {
                    case "P":
                        carta1.setPalo("picas");
                        break;
                    case "D":
                        carta1.setPalo("rombos");
                        break;
                    case "T":
                        carta1.setPalo("tréboles");
                        break;
                    case "C":
                        carta1.setPalo("corazones");
                        break;
                }
                //Token 3
                switch (tokens[3]) {
                    case "P":
                        carta2.setPalo("picas");
                        break;
                    case "D":
                        carta2.setPalo("rombos");
                        break;
                    case "T":
                        carta2.setPalo("tréboles");
                        break;
                    case "C":
                        carta2.setPalo("corazones");
                        break;
                }
                //Token 5
                switch (tokens[5]) {
                    case "P":
                        carta3.setPalo("picas");
                        break;
                    case "D":
                        carta3.setPalo("rombos");
                        break;
                    case "T":
                        carta3.setPalo("tréboles");
                        break;
                    case "C":
                        carta3.setPalo("corazones");
                        break;
                }

                //Token 7
                switch (tokens[7]) {
                    case "P":
                        carta4.setPalo("picas");
                        break;
                    case "D":
                        carta4.setPalo("rombos");
                        break;
                    case "T":
                        carta4.setPalo("tréboles");
                        break;
                    case "C":
                        carta4.setPalo("corazones");
                        break;
                }
                baraja.add(carta1);
                baraja.add(carta2);
                baraja.add(carta3);
                baraja.add(carta4);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return baraja;
    }

}
