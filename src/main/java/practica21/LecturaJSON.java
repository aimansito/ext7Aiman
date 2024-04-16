/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class LecturaJSON {
    public static ArrayList<RegistroJSON> leerJSON(String ruta) throws IOException{
        ArrayList<RegistroJSON> registro = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        try{
            registro = (mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class)));
            for (RegistroJSON registroJSON : registro) {
                System.out.println(registroJSON);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return registro;
    }
    
}
