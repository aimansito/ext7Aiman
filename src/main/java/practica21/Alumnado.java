/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author aiman
 */
public class Alumnado implements Comparable<Alumnado>{
    private String nombre;
    private Map<String,String> map ;

    public Alumnado() {
    }

    public String toCSV(){
        return this.nombre+","+this.map;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    
    @Override
    public int compareTo(Alumnado o) {
        return this.nombre.compareTo(o.getNombre());
    }
    
    @Override
    public String toString() {
        
        String string = "";
        
        string += this.nombre + "\n";
        
        for (String s : this.map.keySet()) {
            
            string += s + ": " + this.map.get(s) + " ";
            
        }
        
        return string ;
    }
}
