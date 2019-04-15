package models;

import Utilidades.Utilidades;
import interfaces.Beber;
import interfaces.Orinar;


public class Espartano extends Humano {

    private Integer toleranciaExtra = 80;
    private Integer bebedorComun = 20;
    private Double bebidoEnRonda;

    public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        super(nombre, edad, peso, orinar, beber);
    }

    @Override
    public void ronda(){

        bebidoEnRonda = beber.Beber(bebedorComun);
        super.cantidadBebida = super.cantidadBebida + bebidoEnRonda;

        super.orino = orinar.Orinar(toleranciaExtra);
        if (super.orino){
            System.out.println("El Espartano " + super.nombre + " No puede mas y se fue al baño");
        }else{
            System.out.println("El Espartano " + super.nombre + " Se las banca, va por otra pinta mas!");
        }

    }

    @Override
    public String toString() {
        return "Espartano {" +
                " Nombre = ' " + nombre + " \'" +
                ", Edad = " + edad +
                ", Peso = " + peso +
                "} \n";
    }
}
