/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import ejercicio4.*;
import java.time.LocalDate;

/**
 *
 * @author cristina
 */
public class Precipitacion {

    //Atributos
    private LocalDate fecha;
    private String estacionMeteorologica;
    private String provincia;
    private double precipitacion;

    //Constructores
    public Precipitacion() {
    }

    public Precipitacion(LocalDate fecha, String estacionMeteorologica, String provincia, double precipitacion) {
        this.fecha = fecha;
        this.estacionMeteorologica = estacionMeteorologica;
        this.provincia = provincia;
        this.precipitacion = precipitacion;
    }

    //getters y setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Precipitacion{" + "fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia=" + provincia + ", precipitacion=" + precipitacion + '}';
    }

}
