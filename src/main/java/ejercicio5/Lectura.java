/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Lectura {

    //Método el cual lee un fichero JSON introduciendo por parámetro la ruta y devuelve una lista
    public static ArrayList<Precipitacion> leerFicheroJSON(String idFichero) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<Precipitacion> listaPreci = mapeador.readValue(new File(idFichero),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Precipitacion.class));
        return listaPreci;
    }
}
