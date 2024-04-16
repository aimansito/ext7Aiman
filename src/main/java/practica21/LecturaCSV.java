/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author aiman
 */
public class LecturaCSV {
    public static Map<String,String> leerCSV(String ruta) throws FileNotFoundException{
        Map<String,String> map = new TreeMap<>();
        String[] tokens ;
        String linea;
        
        try(Scanner datosFichero = new Scanner(new FileReader(ruta))){
            linea = datosFichero.nextLine(); // salta la primera linea
            
            while(datosFichero.hasNextLine()){
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                map.put(tokens[0], tokens[1]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        return map;
    }
}
