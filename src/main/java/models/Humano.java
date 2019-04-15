package models;

import interfaces.Beber;
import interfaces.Orinar;

import java.util.Random;

public abstract class Humano implements Comparable{

    protected String nombre;
    protected Integer edad;
    protected Integer peso;
    protected Orinar orinar;
    protected Beber beber;
    protected Double cantidadBebida;
    protected Boolean orino;


    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
        this.cantidadBebida = 0.00;
        this.orino = false;

    }

    public Double getCantidadBebida() {
        return cantidadBebida;
    }

    public Boolean getOrino() {

        return orino;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Orinar getOrinar() {
        return orinar;
    }

    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }

    public Beber getBeber() {
        return beber;
    }

    public void setBeber(Beber beber) {
        this.beber = beber;
    }

    public void resetearStats(){
        this.orino = false;
        this.cantidadBebida = 0.00;
    }


    public int compareTo(Object o) {
        Humano humano = (Humano) o;
        if (edad < humano.getEdad()){
            return 1;
        }else{
            return -1;
        }
    }

    public abstract void ronda();
}
