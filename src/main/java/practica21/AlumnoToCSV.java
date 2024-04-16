/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 *
 * @author aiman
 */
public class AlumnoToCSV {
     public static void alumnoTSV(Alumnado a, Map<String, String> m){
        
        crearDirectorio("./alumnado");
        
        String ruta = "./alumnado/" + a.getNombre().replace(" ", "") + ".tsv";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ruta))) {

            
            
            for (String s1 : a.getMap().keySet()) { //Recorre toda la lista

                for (String s2 : m.keySet()) {
                    
                    if (s1.equals(s2)){
                        
                        flujo.write(m.get(s2) + "\t" + a.getMap().get(s1));
                    }
                    
                }

                flujo.newLine();

            }

            flujo.flush(); //Guarda cambios en disco

            System.out.println("Archivo creado correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
        public static void crearDirectorio(String ruta) {

        Path directorio = Paths.get(ruta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectory(directorio);
                System.out.println("Se ha creado el directorio");
            }
        } catch (AccessDeniedException ade) {
            System.out.println("Acceso denegado");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
