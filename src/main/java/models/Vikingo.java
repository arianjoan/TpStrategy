package models;

import Utilidades.Utilidades;
import interfaces.Beber;
import interfaces.Orinar;

public class Vikingo extends Humano {

    private static final Integer bebedorProfesional = 30;
    private static final Integer toleranciaComun = 70;
    private Double bebidoEnRonda;

    public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        super(nombre, edad, peso, orinar, beber);
    }

    @Override
    public void ronda(){

        bebidoEnRonda = beber.Beber(bebedorProfesional);
        super.cantidadBebida = super.cantidadBebida + bebidoEnRonda;

        super.orino = orinar.Orinar(toleranciaComun);
        if (super.orino){
            System.out.println("El vikingo " + super.nombre + " No aguanto mas y se fue a orinar");
        }else{
            System.out.println("El vikingo " + super.nombre + " Sigue con su vejiga de acero, va por otra pinta mas!");
        }

    }

    @Override
    public String toString() {
        return "Vikingo {" +
                " Nombre = ' " + nombre + " \'" +
                ", Edad = " + edad +
                ", Peso = " + peso +
                "} \n";
    }


}
