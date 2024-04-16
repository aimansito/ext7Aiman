/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class Baraja {

    //atributos
    private String palo;
    private int valor;

    //Atributo que uso para generar cartas aleatoriamente
    private Random random;

    //Constructores
    //Parametrizado
    public Baraja(String palo, int valor) {
        //Si no es uno de los palos no se acepta
        if (palo.equalsIgnoreCase("picas") || palo.equalsIgnoreCase("rombos")
                || palo.equalsIgnoreCase("corazones") || palo.equalsIgnoreCase("tréboles")) {
            this.palo = palo;
        }

        //Si no es un valor válido no se acepta
        if (valor >= 2 && valor <= 14) {
            this.valor = valor;
        }

    }

    public Baraja() {

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String valor = "";
        if (this.valor >= 11 && this.valor <= 14) {
            switch (this.valor) {
                case 11:
                    valor = "J(Jack)";
                    break;
                case 12:
                    valor = "Q(Queen)";
                    break;
                case 13:
                    valor = "K(King)";
                    break;
                case 14:
                    valor = "A(As)";
                    break;
            }
        } else {
            valor = String.valueOf(this.valor);
        }
        return valor + " | " + palo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.palo);
        hash = 17 * hash + this.valor;
        hash = 17 * hash + Objects.hashCode(this.random);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Baraja other = (Baraja) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return Objects.equals(this.random, other.random);
    }

}
