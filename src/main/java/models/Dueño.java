package models;

import interfaces.Beber;
import interfaces.Orinar;

public class Dueño extends Humano {

    private Integer toleranciaSuprema = 85;
    private Integer bebedorSupremo = 40;
    private Double bebidoEnRonda;

    public Dueño(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        super(nombre, edad, peso, orinar, beber);
    }


    public void ronda(){

        bebidoEnRonda = beber.Beber(bebedorSupremo);
        super.cantidadBebida = super.cantidadBebida + bebidoEnRonda;

        super.orino = orinar.Orinar(toleranciaSuprema);
        if (super.orino){
            System.out.println("El Dueño " + super.nombre + " Al fin va a dejar de tomar, y se ira al baño");
        }else{
            System.out.println("El Dueño " + super.nombre + " Parece inamobible, va por otra birra mas");
        }

    }

    @Override
    public String toString() {
        return "Dueño {" +
                " Nombre = ' " + nombre + " \'" +
                ", Edad = " + edad +
                ", Peso = " + peso +
                "} \n";
    }

}
