/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aiman
 */
public class RegistrosToAlumnado {
    public static ArrayList<Alumnado> regToAlum(ArrayList<RegistroJSON> lista){
        
        ArrayList<Alumnado> alumnos = new ArrayList<>();
        
        for (RegistroJSON r : lista) {
            
            Alumnado a = new Alumnado();
            
            a.setNombre(r.getAlumnoA());
            
            Map<String, String> map = new HashMap<>();
            
            map.put("OACV", r.getoACV());
            map.put("EA", r.getoACV());
            map.put("TII", r.getoACV());
            map.put("TC", r.getoACV());
            map.put("ING", r.getoACV());
            map.put("FOL", r.getoACV());
            map.put("CEAC", r.getoACV());
            
            a.setMap(map);
            alumnos.add(a);
            
        }
        
        return alumnos;
    }
}
