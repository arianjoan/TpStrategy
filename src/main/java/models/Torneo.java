package models;

import Utilidades.Utilidades;
import pdo.TorneoPdo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Torneo {

    private List<Vikingo> vikingos;
    private List<Espartano> espartanos;
    private Dueño duenio;

    public Torneo(List<Vikingo> vikingos,List<Espartano> espartanos,Dueño duenio) {
        this.vikingos = vikingos;
        this.espartanos = espartanos;
        this.duenio = duenio;
    }

    public void presentarJugadores(){
        System.out.println("----------------------------------------");
        System.out.println("LOS VIKINGOS QUE SIENTEN QUE LA TABERNA ES SUYA SON:");
        System.out.println(vikingos);
        System.out.println("----------------------------------------");
        System.out.println("LOS INTRUSOS ESPARTANOS QUE QUIEREN COPAR COPENAGHE SON:");
        System.out.println(espartanos);
        System.out.println("----------------------------------------");
    }

    public void ordenarJugadoresPorEdad(){

        vikingos = vikingos.stream().sorted().collect(Collectors.toList());
        espartanos = espartanos.stream().sorted().collect(Collectors.toList());

    }

    public Vikingo seleccionarVikingo(){

        if (vikingos.size() <= 0){
            return null;
        }else{
            return vikingos.get(Utilidades.getRandom().nextInt(vikingos.size()));
        }

    }

    public Espartano seleccionarEspartano(){

        if (espartanos.size() <= 0){
            return null;
        }else{
            return espartanos.get(Utilidades.getRandom().nextInt(espartanos.size()));
        }

    }

    public Dueño invocarDuenio(){
        return duenio;
    }

    public Humano pelea(){

        Humano ganador;
        Vikingo vikingo = seleccionarVikingo();
        Espartano espartano = seleccionarEspartano();

        System.out.println(String.format("Quienes se van a enfrentar son: \n %s Por el lado de los vikingos! \n %s Por el lado de los espartanos",
                vikingo.nombre,espartano.nombre));
        System.out.println("\n -------------------------------------------------");
        System.out.println("LA PELEA COMIENZA YA!!!!!");
        System.out.println("--------------------------------------------------\n");

        while (!vikingo.getOrino()){
            vikingo.ronda();
        }

        while (!espartano.getOrino()){
            espartano.ronda();
        }

        if (espartano.getCantidadBebida() > vikingo.getCantidadBebida()){
            System.out.println(String.format("El ganador es el espartano %s habiendo bebido una cantidad de %.2f litros de birra",
                    espartano.nombre,espartano.cantidadBebida/1000));
            ganador = espartano;
        }else{
            System.out.println(String.format("El ganador es el vikingo %s habiendo bebido una cantidad de %.2f litros de birra",
                    vikingo.nombre,vikingo.cantidadBebida/1000));
            ganador = vikingo;
        }

        return ganador;
    }

    public Humano peleaFinal(Humano ganador){

        Humano ganadorFinal;
        Humano subcampeon;

        ganador.resetearStats();
        duenio.resetearStats();

        System.out.println("\n -------------- PELEA FINAL ------------ \n");

        System.out.println(String.format("El ganador %s Desafia a %s Por la taberna!!!",ganador.nombre,duenio.nombre));

        System.out.println("\n -------------------------------------------------");
        System.out.println("LA PELEA COMIENZA YA!!!!!");
        System.out.println("--------------------------------------------------\n");



        while (!ganador.getOrino()){
            ganador.ronda();
        }

        while (!duenio.getOrino()){
            duenio.ronda();
        }

        if (duenio.getCantidadBebida() > ganador.getCantidadBebida()){
            System.out.println(String.format("El ganador es el Duenio %s habiendo bebido una cantidad de %.2f litros de birra",
                    duenio.nombre,duenio.cantidadBebida/1000));
            ganadorFinal = duenio;
            subcampeon = ganador;
        }else{
            System.out.println(String.format("El ganador es %s habiendo bebido una cantidad de %.2f litros de birra, asi HUMILLANDO AL DUENIO DE LA TABERNA",
                    ganador.nombre,ganador.cantidadBebida/1000));
            ganadorFinal = ganador;
            subcampeon = duenio;
        }

        TorneoPdo.insertarTorneo(ganadorFinal,subcampeon);

        return ganadorFinal;



    }


}
